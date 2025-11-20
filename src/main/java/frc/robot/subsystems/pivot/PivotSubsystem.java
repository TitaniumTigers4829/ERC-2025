// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.pivot;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;
import edu.wpi.first.wpilibj.smartdashboard.MechanismLigament2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PivotSubsystem extends SubsystemBase {
  /** Creates a new PivotSubsystem. */
  public PWMSparkMax pivotMotor;
  public Encoder encoder;
  public SimpleMotorFeedforward feedForward;
  public PIDController pidController;
  public PivotSubsystem() {
    pivotMotor = new PWMSparkMax(PivotConstants.PIVOT_MOTOR_ID);
    encoder = new Encoder(0, 0); // ADD THESE VALUES, too lazy to make constants for them rn
    feedForward = new SimpleMotorFeedforward(1, 0);
    pidController = new PIDController(1, 0, 0);
  }

  public void setPivotAngle(double angle) {
    pivotMotor.set(pidController.calculate((encoder.getDistance()/PivotConstants.WHEEL_RADIUS)/PivotConstants.GEAR_RATIO, (angle*PivotConstants.WHEEL_RADIUS)/PivotConstants.GEAR_RATIO));
    
  }

  public void setZeroAngle() {
    pivotMotor.set(pidController.calculate((encoder.getDistance()/PivotConstants.WHEEL_RADIUS)/PivotConstants.GEAR_RATIO, 0));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
