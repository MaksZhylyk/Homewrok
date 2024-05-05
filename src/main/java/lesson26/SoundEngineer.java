package lesson27;

public class SoundEngineer extends FilmStudioEmployee{
    public SoundEngineer(String name, String position, int experienceYear) {
        super(name, position, experienceYear);
    }
    public void recordSound(){
        System.out.println(getName() + " record sound" );
    }

    @Override
    public String toString() {
        return "SoundEngineer{}";
    }

    @Override
    public void work() {
        System.out.println(getName() + " checks sound");
    }
}
