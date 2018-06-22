package by.epam.preTraining.punkoDmitri.tasks.task07.view;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Vehicle;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.logic.Storable;

public class ConsolePrinter {
    public static void print(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println(vehicle.toString());
        } else System.out.println("null");

    }

    public static void print(Storable printable) {
        if (printable != null) {
            System.out.println(printable.toString());
        } else System.out.println("null");
    }
}
