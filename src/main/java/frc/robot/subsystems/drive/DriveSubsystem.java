// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
    public VictorSP driveMotor1;
    public VictorSP driveMotor2;
    public VictorSP driveMotor3;
    public VictorSP driveMotor4;
    public VictorSP driveMotor5;
    public VictorSP driveMotor6;
    public DriveSubsystem () {
    
      driveMotor1 = new VictorSP(DriveConstants.DRIVE_MOTOR_1_ID);
      driveMotor2 = new VictorSP(DriveConstants.DRIVE_MOTOR_2_ID);
      driveMotor3 = new VictorSP(DriveConstants.DRIVE_MOTOR_3_ID);
      driveMotor4 = new VictorSP(DriveConstants.DRIVE_MOTOR_4_ID);
      driveMotor5 = new VictorSP(DriveConstants.DRIVE_MOTOR_5_ID);
      driveMotor6 = new VictorSP(DriveConstants.DRIVE_MOTOR_6_ID);  
    }
  
    /**
     * Example command factory method.
          * @return 
          *
          * @return a command
          */
         
}