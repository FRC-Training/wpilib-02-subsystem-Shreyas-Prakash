/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


/*
This is a Subsystem with one TalonSRX motor controller.
*/
public class MySubsystem extends Subsystem {
  //Declare all components of Subsystem
  TalonSRX myMotor;

  //In Constructor, Initialize all components of Subsystem
  public MySubsystem() {
    //Initialize Talon to CAN Address.
    //It is good practice to use constants located in RobotMap
    myMotor = new TalonSRX(RobotMap.myMotorCanID);
  }

  //When this method is called the motor is run at full speed (1)
  public void RunMotorFullSpeed() {
    myMotor.set(ControlMode.PercentOutput, 1);
  }

  //When this method is called the motor is run at half speed (.5)
  public void RunMotorHalfSpeed() {
    myMotor.set(ControlMode.PercentOutput, .5);
  }

  //When this method is called the motor is stopped (0)
  public void StopMotor() {
    myMotor.set(ControlMode.PercentOutput, 0);
  }

  //When this method is called the motor is run at the input speed
  public void RunMotorAtSpeed(double speed) {
    myMotor.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    //We will cover this when we get to Commands
  }
}
