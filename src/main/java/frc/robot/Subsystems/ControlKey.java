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


public class ControlKey extends Subsystem {
  private WPI_TalonSRX driveMotor = new WPI_TalonSRX(RobotMap.motorControlKeyDriverID);
  private WPI_TalonSRX pivotMotor = new WPI_TalonSRX(RobotMap.motorControlKeyPivotID);

  @Override
  public void initDefaultCommand() {
    
  }

  public void pivotControlKey(double speed) {
    pivotMotor.set(speed);
  }

  public void driveControlKey(double speed) {
    driveMotor.set(speed);
  }

}
