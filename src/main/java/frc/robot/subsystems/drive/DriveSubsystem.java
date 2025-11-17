// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  public final DifferentialDrive tankDrive;
  public MotorControllerGroup leftMotors;
  public MotorControllerGroup rightMotors;

   
    public PWMTalonFX driveMotor1;
    public PWMTalonFX driveMotor2;
    public PWMTalonFX driveMotor3;
    public PWMTalonFX driveMotor4;
    public PWMTalonFX driveMotor5;
    public PWMTalonFX driveMotor6;
    @SuppressWarnings("removal")
    public DriveSubsystem () {
    
      driveMotor1 = new PWMTalonFX(DriveConstants.DRIVE_MOTOR_1_ID);
      driveMotor2 = new PWMTalonFX(DriveConstants.DRIVE_MOTOR_2_ID);
      driveMotor3 = new PWMTalonFX(DriveConstants.DRIVE_MOTOR_3_ID);
      driveMotor4 = new PWMTalonFX(DriveConstants.DRIVE_MOTOR_4_ID);
      driveMotor5 = new PWMTalonFX(DriveConstants.DRIVE_MOTOR_5_ID);
      driveMotor6 = new PWMTalonFX(DriveConstants.DRIVE_MOTOR_6_ID);
      leftMotors = new MotorControllerGroup(driveMotor1, driveMotor2, driveMotor3);
      rightMotors = new MotorControllerGroup(driveMotor4, driveMotor5, driveMotor6);
      rightMotors.setInverted(true);
      tankDrive = new DifferentialDrive(leftMotors, rightMotors);
    }
  
    public void driveCommand(double leftSpeed, double rightSpeed) {
      tankDrive.arcadeDrive(leftSpeed, rightSpeed, true);
    }

    /**
     * Example command factory method.
          * @return 
          *
          * @return a command
          */
         
}