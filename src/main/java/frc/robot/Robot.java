/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import subsystems.DriveConvoy;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code
   */
<<<<<<< HEAD
  private Joystick sillyStick = new Joystick(0);
  private DriveConvoy DriveConvoy = new DriveConvoy();


=======
  Private JoystickButton aButton = new JoystickButton(sillyStick, buttonNum);
  
  IntakeIn suckIn = new IntakeIn();

  aButton.whileheld(suckIn);
  
>>>>>>> c13f072a4a3eb0fbf7909c0b388cacd515c349f8
  @Override
  public void robotInit() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {if(sillyStick.getRawAxis(1)<-0.1){}




  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
