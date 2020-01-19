package frc.robot.Commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive extends Command {
  public ArcadeDrive() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void execute() {
    Robot.driveTrain.arcadeDrive(Robot.oi.getArcadeSpeed(), Robot.oi.getArcadeRoationThrottle());
  }

  @Override
  protected void end() {
    Robot.driveTrain.stop();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
}