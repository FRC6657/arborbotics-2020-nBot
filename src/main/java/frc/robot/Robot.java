/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.Subsystems.Gun;
import frc.robot.Subsystems.Drivetrain;
import frc.robot.OI;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static Gun gun = new Gun();
  public static Drivetrain driveTrain = new Drivetrain();
  
  public static OI oi;

  public Robot() {
    gun = new Gun();
    oi = new OI();
    
    SmartDashboard.putNumber("Left Encoder", driveTrain.getEncoderLeft());
    SmartDashboard.putNumber("Right Encoder", driveTrain.getEncoderRight());
    SmartDashboard.putNumber("Distance", driveTrain.getDistance());
  }

  @Override
  public void robotInit() {
  }

  @Override
  public void robotPeriodic() {
    SmartDashboard.putNumber("Left Encoder", driveTrain.getEncoderLeft());
    SmartDashboard.putNumber("Right Encoder", driveTrain.getEncoderRight());
    SmartDashboard.putNumber("Distance", driveTrain.getDistance());
  }

  @Override
  public void disabledInit() {
    driveTrain.reset();
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    driveTrain.reset();
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
