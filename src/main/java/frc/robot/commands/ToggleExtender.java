package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.HatchLatcher;

public class ToggleExtender extends InstantCommand {
    
    public ToggleExtender() {
        addRequirements(HatchLatcher.getInstance());
    }

    public void initialize() {
        HatchLatcher.getInstance().toggleExtender();
    }

}
