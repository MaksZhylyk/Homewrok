package lesson34;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal {
    private static final Logger LOGGER = LoggerFactory.getLogger(Animal.class);
    private String name;
    private int energy;

    public Animal(String name) {
        this.name = name;
        this.energy = 100;
        LOGGER.info("Новое животное: {}.", name);
    }

    public String getName() {
        return name;
    }


    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void eat(){
        energy = energy + 20;
        LOGGER.info("Животное {} поело и его энергия теперь {}.", name, energy);
    }
    public void sleep(){
        energy = energy + 30;
        LOGGER.info("Животное {} поспало и его энергия теперь {}.", name, energy);
    }
    public void play() {
        energy = energy - 40;
        if(energy > 0){
            LOGGER.info("Животное {} поиграло и его энергия теперь {}.", name, energy);
        } else {
            LOGGER.warn("Животное {} устало и нуждается в отдыхе и его энергия {}.", name, energy);
            energy = 0;
        }
    }
}
