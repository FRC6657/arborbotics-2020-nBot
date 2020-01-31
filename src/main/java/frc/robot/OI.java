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
import frc.robot.Commands.RunScissorLift;
import frc.robot.Commands.Suck;
import frc.robot.Commands.ControlKeyPivot;
import frc.robot.Commands.ControlKeyDrive;


public class OI {

  public Joystick stick;

  public JoystickButton fireGun;
  public JoystickButton suckIntake;
  public JoystickButton controlKeyPivot1;
  public JoystickButton controlKeyPivot2;
  public JoystickButton controlKeyDrive;
  public JoystickButton scissorLiftDrive1;
  public JoystickButton scissorLiftDrive2;

  public OI() {
    stick = new Joystick(0);

	fireGun = new JoystickButton(stick, 1);
	suckIntake  = new JoystickButton(stick, 2);
	controlKeyDrive = new JoystickButton(stick, 5);
	controlKeyPivot1 = new JoystickButton(stick, 3);
	controlKeyPivot2 = new JoystickButton(stick, 4);
	scissorLiftDrive1 = new JoystickButton(stick, 11);
	scissorLiftDrive2 = new JoystickButton(stick, 12);

    FireGun fg = new FireGun();
	fireGun.whileHeld(fg);
	
	Suck s = new Suck();
	suckIntake.whileHeld(s);

	ControlKeyDrive ckd = new ControlKeyDrive();
	controlKeyDrive.whileHeld(ckd);

	ControlKeyPivot ckp1 = new ControlKeyPivot(0.3);
	controlKeyPivot1.whileHeld(ckp1);

	ControlKeyPivot ckp2 = new ControlKeyPivot(-0.3);
	controlKeyPivot2.whileHeld(ckp2);

	RunScissorLift rsl1 = new RunScissorLift(0.4);
	scissorLiftDrive1.whileHeld(rsl1);

	RunScissorLift rsl2 = new RunScissorLift(-0.4);
	scissorLiftDrive2.whileHeld(rsl2);
	
  }

  public double getArcadeSpeed() { //Gets modified joystick speed
		double supaY = stick.getY();
		return (-supaY*supaY*Math.signum(supaY) + 0.1) * RobotMap.joystickArcadeSpeedModifier;
	}

 	public double getArcadeRotation() { //Gets joystick rotation
		double supaTwist =  stick.getTwist();
		return (supaTwist) * RobotMap.joystickArcadeRotationModifier;
	}
	
}
