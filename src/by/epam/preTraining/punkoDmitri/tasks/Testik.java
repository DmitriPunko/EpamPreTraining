package by.epam.preTraining.punkoDmitri.tasks;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Vehicle;

import java.util.Date;

public class Testik {
    public static void main(String[] args) {
        long beforeIn = new Date().getTime();
        in();
        long afterIn = new Date().getTime();
        System.out.println(afterIn - beforeIn);

        long beforeOut = new Date().getTime();
        out();
        long afterOut = new Date().getTime();
        System.out.println(afterOut - beforeOut);

    }

    public static void in() {
        for (int i = 0; i < 1000000000; i++) {
            int j = 5;
        }
    }

    public static void out() {
        int j;
        for (int i = 0; i < 1000000000; i++) {
            j = 5;
        }
    }
}
