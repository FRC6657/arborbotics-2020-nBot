/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Intake extends Subsystem {
  private WPI_TalonSRX motor = new WPI_TalonSRX(RobotMap.motorIntakeID);

  @Override
  public void initDefaultCommand() {
  }

  public void suck(double speed) {
    motor.set(speed);
  }

  public void stop() {
    motor.set(0);
  }
}
