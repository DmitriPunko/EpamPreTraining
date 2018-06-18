package by.epam.preTraining.punkoDmitri.tasks.task07.util;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.PassengerCar;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Truck;

import java.util.Random;

public class Creator {

    public static final String COLORS[] = {"white", "yellow", "red", "orange", "green", "blue", "black", "brown"};
    public static final String MODELS[] = {"BMW", "FORD", "MERCEDES", "VOLVO", "AUDI", "VOLKSWAGEN", "SKODA", "RENO"};

    public static PassengerCar createPassengerCar() {

        Random random = new Random();

        return new PassengerCar((byte) (random.nextInt(6) + 2),
                COLORS[random.nextInt(8)],
                MODELS[random.nextInt(8)],
                (random.nextInt(29) + 1990),
                Math.abs(random.nextInt()),
                random.nextInt(50000),
                (random.nextInt(400) + 100));
    }

    public static Truck createTruck() {

        Random random = new Random();

        return new Truck((byte) (random.nextInt(6) + 1),
                COLORS[random.nextInt(8)],
                MODELS[random.nextInt(8)],
                (random.nextInt(29) + 1990),
                Math.abs(random.nextInt()),
                random.nextInt(50000),
                (random.nextInt(20000) + 500),
                (random.nextInt(2) + 2));

    }
}
