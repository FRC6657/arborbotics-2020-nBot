/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
/**
 * Add your docs here.
 */
public class DriveConvoy extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Motors
 
  public void DriveConvoy(){
    final WPI_TalonSRX motorFrontLeft = new WPI_TalonSRX(1);
 final WPI_TalonSRX motorFrontRight=new WPI_TalonSRX(2);
  final WPI_VictorSPX motorBackLeft=new WPI_VictorSPX(3);
 final WPI_VictorSPX motorBackRight=new WPI_VictorSPX(4);
}

  @Override
  public void initDefaultCommand() { 
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

   
  } 

    public void robotInit(){



    }
    
}
