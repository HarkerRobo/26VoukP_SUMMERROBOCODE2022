package frc.robot;

import harkerrobolib.wrappers.HSGamepad;
import harkerrobolib.wrappers.XboxGamepad;

public class OI {
    private static OI instance;
    private HSGamepad driver;

    private static final int DRIVER_ID = 0;

    public OI() {
        driver = new XboxGamepad(DRIVER_ID);
    }

    public HSGamepad getDriver() {
        return driver;
    }

    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }
        return instance;
    }
}
