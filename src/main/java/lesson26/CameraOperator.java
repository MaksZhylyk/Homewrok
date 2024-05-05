package lesson27;

public class CameraOperator extends  FilmStudioEmployee {
    public CameraOperator(String name, String position, int experienceYear) {
        super(name, position, experienceYear);
    }
        public void operatorCamera(){
            System.out.println(getName() + " is operating the camera");

        }

    @Override
    public String toString() {
        return "CameraOperator{}";
    }

    @Override
    public void work() {
        System.out.println(getName() + "is making light");
    }
}
