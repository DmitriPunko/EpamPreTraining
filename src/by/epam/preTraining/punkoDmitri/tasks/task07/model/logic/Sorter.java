package by.epam.preTraining.punkoDmitri.tasks.task07.model.logic;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Vehicle;

public class Sorter {

    public static void sortByPriceAscending(Storable vehicles) {

        if (vehicles == null) {
            return;
        }

        int countI = vehicles.size() - 1;

        for (int i = 0; i < countI; i++) {
            boolean flag = false;
            int countJ = vehicles.size();
            for (int j = i + 1; j < countJ; j++) {
                if (vehicles.get(j).getPrice() < vehicles.get(i).getPrice()) {
                    Vehicle temp = vehicles.get(i);
                    vehicles.set(i, vehicles.get(j));
                    vehicles.set(j, temp);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
