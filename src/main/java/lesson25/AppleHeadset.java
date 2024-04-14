package lesson25;

public class AppleHeadset extends Headset {
    private String softwareVersion;

    public AppleHeadset(boolean waterResistant, String color, ConnectionType connectionType,
                        String brand, Size size, int soundLevel, boolean hasMicrophone,
                        ChargedType chargedType, String softwareVersion) {
        super(waterResistant, color, connectionType, brand, size, soundLevel, hasMicrophone, chargedType);
        this.softwareVersion = softwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }
}
