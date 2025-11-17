package frc.robot.commands;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.shooter.ShooterConstants;
import frc.robot.subsystems.shooter.ShooterSubsystem;

public class ShooterCommand extends Command {
    private ShooterSubsystem subsystem;
    private PWMTalonFX motor;
    public double speed = 0.5;
    public ShooterCommand(ShooterSubsystem subsystem) {
        this.subsystem = subsystem;
        this.motor = subsystem.shooterMotor;
        addRequirements(subsystem);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        motor.set(speed);
    }

    @Override
    public void end(boolean interrupted) {
        motor.set(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
