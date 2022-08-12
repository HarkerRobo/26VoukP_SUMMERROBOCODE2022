package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import harkerrobolib.wrappers.HSTalon;

public class WristRollers extends SubsystemBase {
    private static WristRollers instance;
    
    private HSTalon motor;

    private static final int MOTOR_ID = 0;

    private static final boolean MOTOR_INVERT = false;

    public WristRollers() {
        motor = new HSTalon(MOTOR_ID);
        motor.setInverted(MOTOR_INVERT);
    } 

    public void setOutput(double output) {
        motor.set(ControlMode.PercentOutput, output);
    }

    public static WristRollers getInstance() {
        if (instance == null) {
            instance = new WristRollers();
        }
        return instance;
    }
}
