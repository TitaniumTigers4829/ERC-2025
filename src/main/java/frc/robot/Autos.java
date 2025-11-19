// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.GroundIntakeCommand;
import frc.robot.commands.GroundOutakeCommand;
import frc.robot.subsystems.drive.DriveSubsystem;
import frc.robot.subsystems.intake.IntakeSubsystem;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static Command exampleAuto(DriveSubsystem driveSubsystem) {
    return null;
  }

  public static Command mainAuto(DriveSubsystem driveSubsystem, GroundIntakeCommand groundIntakeCommand, GroundOutakeCommand groundOutakeCommand) {
    groundIntakeCommand.execute();
    Timer.delay(1);
    driveSubsystem.driveCommand(0, 0.5);
    Timer.delay(1);
    groundOutakeCommand.execute();
    Timer.delay(1);
    driveSubsystem.driveCommand(0, -0.5);
    Timer.delay(1);
    driveSubsystem.driveCommand(0.5, 0);
    Timer.delay(1);

    groundIntakeCommand.execute();
    Timer.delay(1);
    driveSubsystem.driveCommand(0, 0.5);
    Timer.delay(1);
    groundOutakeCommand.execute();
    Timer.delay(1);
    driveSubsystem.driveCommand(0,-0.5);
    Timer.delay(1);
    


    return null;
  } 

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}