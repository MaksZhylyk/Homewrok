package lesson15;

public class Homework {
    public static void main(String[] args) {
        printAnimalSounds();
    }

    public static String[] animalSpecies = {"Лев", "Слон", "Обезьяна"};
    public static String[] animalSounds = {"Рёв", "Трубление", "Угуканье"};

    public static void printAnimalSounds() {
        for (int i = 0; i < animalSpecies.length; i++) {
            System.out.println(animalSpecies[i] + " - " + animalSounds[i]);
        }
    }
}

