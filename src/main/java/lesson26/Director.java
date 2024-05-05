package lesson27;

public class Director extends FilmStudioEmployee{
    public Director(String name, String position, int experienceYear) {
        super(name, position, experienceYear);
    }
    public void director(){
        System.out.println(getName() + "is a director");
    }

    @Override
    public String toString() {
        return "Director{}";
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Director makes Castings");
    }
}
