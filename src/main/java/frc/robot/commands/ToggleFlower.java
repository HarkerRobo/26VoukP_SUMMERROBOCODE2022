package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.HatchLatcher;

public class ToggleFlower extends InstantCommand {

    public ToggleFlower() {
        addRequirements(HatchLatcher.getInstance());
    }
    
    public void initialize() {
        HatchLatcher.getInstance().toggleFlower();
    }
    
    public void end(boolean interrupted) {
        
    }

}
