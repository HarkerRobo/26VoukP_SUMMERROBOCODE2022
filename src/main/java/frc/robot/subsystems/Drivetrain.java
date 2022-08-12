package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import harkerrobolib.wrappers.HSTalon;

public class Drivetrain extends SubsystemBase {
    private static Drivetrain instance;

    private HSTalon rightMaster;   
    private HSTalon leftMaster;
    private VictorSPX rightFollower;
    private VictorSPX leftFollower;

    private static final int RIGHTMASTER_ID = 0;
    private static final int LEFTMASTER_ID = 0;
    private static final int RIGHTFOLLOWER_ID = 0;
    private static final int LEFTFOLLOWER_ID = 0;

    public static final boolean RIGHTMASTER_INVERT = false;
    public static final boolean LEFTMASTER_INVERT = false;
    public static final boolean RIGHTFOLLOWER_INVERT = false;
    public static final boolean LEFTFOLLOWER_INVERT = false;

    private Drivetrain () {
        rightMaster = new HSTalon(RIGHTMASTER_ID);
        leftMaster = new HSTalon(LEFTMASTER_ID);
        rightFollower = new VictorSPX(RIGHTFOLLOWER_ID);
        leftFollower = new VictorSPX(LEFTFOLLOWER_ID);

        rightMaster.setInverted(RIGHTMASTER_INVERT);
        leftMaster.setInverted(LEFTMASTER_INVERT);
        rightFollower.setInverted(RIGHTFOLLOWER_INVERT);
        leftFollower.setInverted(LEFTFOLLOWER_INVERT);

        rightFollower.follow(rightMaster);
        leftFollower.follow(leftMaster);
    }

    public void setArcadeDrive(double turn, double speed){
        rightMaster.set(ControlMode.PercentOutput, speed - turn);
        leftMaster.set(ControlMode.PercentOutput, speed + turn);
    }
    

    public static Drivetrain getInstance() {
        if (instance == null) {
            instance = new Drivetrain();
        }
        return instance;
    }
}
