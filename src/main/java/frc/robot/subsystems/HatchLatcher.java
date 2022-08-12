package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HatchLatcher extends SubsystemBase {
    private static HatchLatcher instance;
    private static DoubleSolenoid flower;
    private static DoubleSolenoid extender;

    private static final int FORWARD_FLOWER = 0;
    private static final int REVERSE_FLOWER = 0;
    private static final int FORWARD_EXTENDER = 0;
    private static final int REVERSE_EXTENDER = 0;

    public HatchLatcher () {
        flower = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, FORWARD_FLOWER, REVERSE_FLOWER);
        extender = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, FORWARD_EXTENDER, REVERSE_EXTENDER);
    }

    public void toggleFlower() { 
        if (flower.get() == Value.kForward) {
            flower.set(Value.kReverse);
        } else {
            flower.set(Value.kForward);
        }
    }

    public void toggleExtender() { 
        if (extender.get() == Value.kForward) {
            extender.set(Value.kReverse);
        } else {
            extender.set(Value.kForward);
        }
    }

    public static HatchLatcher getInstance() {
        if (instance == null) {
            instance = new HatchLatcher();
        }
        return instance;
    }
}
