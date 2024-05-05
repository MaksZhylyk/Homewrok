package lesson27;

public class FilmStudioEmployee {
    private String name;
    private String position;
    private int experienceYear;

    public FilmStudioEmployee(String name, String position, int experienceYear) {
        this.name = name;
        this.position = position;
        this.experienceYear = experienceYear;
    }
    public void work(){
        System.out.println(name + " works on her current task");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    @Override
    public String toString() {
        return "FilmStudioEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", experienceYear=" + experienceYear +
                '}';
    }
}
