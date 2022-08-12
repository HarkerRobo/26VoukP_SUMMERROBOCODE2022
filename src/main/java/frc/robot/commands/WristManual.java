package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.subsystems.Wrist;

public class WristManual extends CommandBase {
    public WristManual() {
        addRequirements(Wrist.getInstance());
    }

    public void execute() { 
        double output = 0;

        if (OI.getInstance().getDriver().getUpDPadButton().get()) {
            output = 0.7;
        } else if (OI.getInstance().getDriver().getDownDPadButton().get()){
            output = -0.7;
        } else {
            output = 0.2;
        }

        Wrist.getInstance().setOutput(output);
    }

    public void end(boolean interrupted) {
        Wrist.getInstance().setOutput(0);
    }

    
}