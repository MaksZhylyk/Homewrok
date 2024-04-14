package lesson25;

public enum Day {
    MONDAY("Monday is bad day"),
    TUESDAY("Tuesday is better than Monday, but also bad"),
    WEDNESDAY("Wednesday is a small Friday"),
    THURSDAY("Thursday is a small Saturday"),
    FRIDAY("Friday is cool"),
    SATURDAY("Saturday is very cool"),
    SUNDAY("Sunday is good day");

    private String description;

    Day(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
