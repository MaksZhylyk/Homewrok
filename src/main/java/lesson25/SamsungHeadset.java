package lesson25;

public class SamsungHeadset extends Headset {
    private boolean aiVersion;

    public SamsungHeadset(boolean waterResistant, String color, ConnectionType connectionType,
                          String brand, Size size, int soundLevel, boolean hasMicrophone,
                          ChargedType chargedType, boolean aiVersion) {
        super(waterResistant, color, connectionType, brand, size, soundLevel, hasMicrophone, chargedType);
        this.aiVersion = aiVersion;
    }

    public boolean isAiVersion() {
        return aiVersion;
    }
}
