package frc.robot.commands;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.shooter.ShooterSubsystem;

public class ShooterCommand extends Command {
    private ShooterSubsystem subsystem;
    public double speed = 1;
    public ShooterCommand(ShooterSubsystem subsystem) {
        this.subsystem = subsystem;
        addRequirements(subsystem);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        subsystem.shooterMotor.set(speed);
    }

    @Override
    public void end(boolean interrupted) {
        subsystem.shooterMotor.set(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
