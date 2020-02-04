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
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class GraplingHook extends Subsystem {
  private WPI_TalonSRX winchMotor = new WPI_TalonSRX(RobotMap.motorWinchID);
  private DoubleSolenoid sol = new DoubleSolenoid(0, 1);
  private Compressor comp = new Compressor();

  @Override
  public void initDefaultCommand() {
  }

  public void driveWinch(double speed){
    winchMotor.set(speed);
  }
  
  public void solForward() {
    sol.set(Value.kForward);
  }
  public void solReverse() {
    sol.set(Value.kReverse);
  }
  public void compressorOn() {
    comp.setClosedLoopControl(false);
  }
  public void compressorOff() {
    comp.setClosedLoopControl(true);
  }
}
