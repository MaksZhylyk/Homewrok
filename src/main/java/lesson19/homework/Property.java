package lesson19.homework;

import java.util.Objects;

public class Property {
    private String address;
    private String type;

    @Override
    public String toString() {
        return "Property{" +
                "\naddress= '" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(address, property.address) && Objects.equals(type, property.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, type);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Property(String address, String type) {
        this.address = address;
        this.type = type;
    }
}
