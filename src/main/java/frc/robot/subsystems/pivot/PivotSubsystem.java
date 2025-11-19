// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.pivot;

import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;
import edu.wpi.first.wpilibj.smartdashboard.MechanismLigament2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PivotSubsystem extends SubsystemBase {
  /** Creates a new PivotSubsystem. */
  public PWMTalonFX pivotMotor;
  public PivotSubsystem() {
    pivotMotor = new PWMTalonFX(PivotConstants.PIVOT_MOTOR_ID);
  }
  public void setPivotAngle(Angle angle) {
    
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
