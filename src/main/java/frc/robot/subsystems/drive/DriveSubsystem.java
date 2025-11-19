// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  public final DifferentialDrive tankDrive;

  
  public PWMTalonFX driveMotor1;
  public PWMTalonFX driveMotor2;
  public DriveSubsystem () {
  
    driveMotor1 = new PWMTalonFX(DriveConstants.DRIVE_MOTOR_LEFT_ID);
    driveMotor2 = new PWMTalonFX(DriveConstants.DRIVE_MOTOR_LEFT_ID);
    driveMotor2.setInverted(true);
    tankDrive = new DifferentialDrive(driveMotor1, driveMotor2);
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