package by.epam.preTraining.punkoDmitri.tasks.task07.view;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Vehicle;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.logic.Storable;

public class ConsolePrinter {
    public static void print(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }

    public static void print(Storable printable) {
        System.out.println(printable.toString());
    }
}
