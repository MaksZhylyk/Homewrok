package lesson25;

public class SamsungHeadsetExperimental extends SamsungHeadset{
    private int stepCounter;

    public SamsungHeadsetExperimental(boolean waterResistant, String color,
                                      ConnectionType connectionType, String brand,
                                      Size size, int soundLevel, boolean hasMicrophone,
                                      ChargedType chargedType, boolean aiVersion, int stepCounter) {
        super(waterResistant, color, connectionType, brand, size, soundLevel, hasMicrophone, chargedType, aiVersion);
        this.stepCounter = stepCounter;
    }

    public int getStepCounter() {
        return stepCounter;
    }

    @Override
    public String toString() {
        return "SamsungHeadsetExperimental{" +
                "stepCounter=" + stepCounter +
                '}';
    }
}
