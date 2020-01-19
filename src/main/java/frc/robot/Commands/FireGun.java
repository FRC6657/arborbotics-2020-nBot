/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class FireGun extends Command {
  public FireGun() {
    requires(Robot.gun);
  }

  // Called when the command is initially scheduled.
  @Override
  public void execute() {
    Robot.gun.fire(0.6);
  }

  @Override
  protected void end() {
    Robot.gun.stop();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
}
