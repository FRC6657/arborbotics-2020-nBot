/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.Commands.FireGun;

public class OI {

  public Joystick stick;

  public JoystickButton fireGun;

  public OI() {
    stick = new Joystick(0);

    fireGun = new JoystickButton(stick, 1);

    FireGun fg = new FireGun();
    fireGun.whileHeld(fg);
  }

  public double getArcadeSpeed() { //Gets modified joystick speed
		double supaY = stick.getY();
		return (-supaY*supaY*Math.signum(supaY) + 0.1) * RobotMap.joystickArcadeSpeedModifier;
	}

 	public double getArcadeRotation() { //Gets joystick rotation
		double supaTwist =  stick.getTwist();
		return (supaTwist) * RobotMap.joystickArcadeRotationModifier;
	}
	
	public double getArcadeRoationThrottle() { //Gets joystick rotation
		double supaTwist = stick.getTwist();
		return supaTwist;
	}
}
