/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import frc.robot.Commands.ArcadeDrive;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drivetrain extends Subsystem {
  
  //Motors
  private WPI_TalonSRX motorFrontLeft = new WPI_TalonSRX(RobotMap.motorFrontLeftID); 
  private WPI_VictorSPX motorBackLeft = new WPI_VictorSPX(RobotMap.motorBackLeftID);	
  private WPI_TalonSRX motorFrontRight = new WPI_TalonSRX(RobotMap.motorFrontRightID);
  private WPI_VictorSPX motorBackRight = new WPI_VictorSPX(RobotMap.motorBackRightID);
  private DifferentialDrive drive;

  //Encoders
  private Encoder encoderLeft = new Encoder(0, 1, true, Encoder.EncodingType.k1X);
  private Encoder encoderRight = new Encoder(2, 3, false, Encoder.EncodingType.k1X);
  
  //Constants
  private static double distancePerRevolution = 15.2 * Math.PI;
	private static double pulsesPerRevolution = 360;
	private static double distancePerPulse = distancePerRevolution / pulsesPerRevolution;
  private double driveMax = 1.0d;
  
  public Drivetrain() {
    
    encoderLeft.setDistancePerPulse(distancePerPulse);
		encoderRight.setDistancePerPulse(distancePerPulse);

		motorFrontLeft.configFactoryDefault();
		motorBackLeft.configFactoryDefault();
		motorFrontRight.configFactoryDefault();
    motorBackRight.configFactoryDefault();

    motorFrontLeft.configOpenloopRamp(0.3, 0);
		motorFrontRight.configOpenloopRamp(0.3, 0);
		drive = new DifferentialDrive(motorFrontLeft, motorFrontRight);

		motorBackLeft.follow(motorFrontLeft);
		motorBackRight.follow(motorFrontRight);
    
    reset();
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArcadeDrive()); 
  }

  public void setMax(double max) { 
		driveMax = max;
  }
	
	public void arcadeDrive(double speed, double rotation) { 
		drive.arcadeDrive(driveMax * speed, driveMax * rotation);
  }
  
  public void stop() {
    drive.tankDrive(0, 0);
    reset();
  }
	
	public void drive(double left, double right) { 
		drive.tankDrive(left, right);
	}
	
	public void reset() { 
		encoderLeft.reset();
		encoderRight.reset();
	}
	
	public double getEncoderLeft() { 
		return encoderLeft.getDistance();
	}
	
	public double getEncoderRight() { 
		return encoderRight.getDistance();
  }

  public double getDistance() { 
    System.out.println((encoderLeft.getDistance()  + encoderRight.getDistance()) / 2);
    return ((encoderLeft.getDistance()  + encoderRight.getDistance()) / 2);
	}
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
