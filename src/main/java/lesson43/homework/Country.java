package lesson43.homework;

public class Country {
    private String name;
    private String capital;
    private long population;
    private double area;

    public Country(String name, String capital, long population, double area) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return name + "," + capital + "," + population + "," + area;
    }
}
