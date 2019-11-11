/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

//Import the TalonSRX and ControlMode from the CTRE Library
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

/**
 * Add your docs here.
 */
public class Solution1 extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Declare two TalonSRX motor controllers
  TalonSRX motor1, motor2;

  //Create a constructor to initialize components
  public Solution1() {
    motor1 = new TalonSRX(RobotMap.motor1CanID);
    motor2 = new TalonSRX(RobotMap.motor2CanID);
  }

  //Set Speed of each motor independently
  public void SetMotorSpeeds(double speed1, double speed2) {
    motor1.set(ControlMode.PercentOutput, speed1);
    motor2.set(ControlMode.PercentOutput, speed2);
  }

  //Set Speed of each motor to the same speed
  public void SetMotorsSameSpeed(double speed) {
    this.SetMotorSpeeds(speed, speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
