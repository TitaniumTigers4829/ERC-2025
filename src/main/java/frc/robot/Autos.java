// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.drive.DriveSubsystem;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static Command exampleAuto(DriveSubsystem subsystem) {
    return null;
  }

  public static Command mainAuto(DriveSubsystem subsystem) {
    // I don't feel like this is gonna work, but Abigail says it's fine - Andrea Fehringer, 11/17/2025 5:28 PM
    subsystem.driveCommand(0.5, 0);
    Timer.delay(5);
    return null;
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
