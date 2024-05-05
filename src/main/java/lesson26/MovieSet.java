package lesson26;

import java.util.ArrayList;

public class MovieSet {
    public static void main(String[] args) {
        ArrayList<FilmStudioEmployee> filmStudioEmployees = new ArrayList<>();
        Director director = new Director("Nick", "Director", 10);
        SoundEngineer soundEngineer = new SoundEngineer("John", "Sound engineer", 6);
        CameraOperator cameraOperator = new CameraOperator("Maks", "Kameraman", 15);
        FinancialDirector financialDirector = new FinancialDirector("Jerry", "Financial Director", 5);
        filmStudioEmployees.add(director);
        filmStudioEmployees.add(soundEngineer);
        filmStudioEmployees.add(financialDirector);
        for(final FilmStudioEmployee filmStudioEmployee : filmStudioEmployees){
            filmStudioEmployee.work();
        }
    }
}
