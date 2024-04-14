package lesson25;

import java.text.Normalizer;

public class Headset {
    private boolean waterResistant;
    private String color;
    private ConnectionType connectionType;
    private String brand;
    private Size size;
    private int soundLevel;
    private boolean hasMicrophone;
    private ChargedType chargedType;

    public Headset(boolean waterResistant, String color, ConnectionType connectionType, String brand, Size size, int soundLevel, boolean hasMicrophone, ChargedType chargedType) {
        this.waterResistant = waterResistant;
        this.color = color;
        this.connectionType = connectionType;
        this.brand = brand;
        this.size = size;
        this.soundLevel = soundLevel;
        this.hasMicrophone = hasMicrophone;
        this.chargedType = chargedType;
    }

    public boolean isWaterResistant() {
        return waterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.waterResistant = waterResistant;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public boolean isHasMicrophone() {
        return hasMicrophone;
    }

    public void setHasMicrophone(boolean hasMicrophone) {
        this.hasMicrophone = hasMicrophone;
    }

    public ChargedType getChargedType() {
        return chargedType;
    }

    public void setChargedType(ChargedType chargedType) {
        this.chargedType = chargedType;
    }

    @Override
    public String toString() {
        return "Headset{" +
                "waterResistant=" + waterResistant +
                ", color='" + color + '\'' +
                ", connectionType=" + connectionType +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", soundLevel=" + soundLevel +
                ", hasMicrophone=" + hasMicrophone +
                ", chargedType=" + chargedType +
                '}';
    }
}
