package by.epam.preTraining.punkoDmitri.tasks.task07.model.logic;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Vehicle;

public class Sorter {

    public static void sortByPriceAscending(Storable vehicles) {
        //method uses bubble sort
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

    public static void sortByPriceDescending(Storable vehicles) {
        //method uses selection sort
        int count = vehicles.size() - 1;
        for (int i = 0; i < count; i++) {
            int maxPrice = vehicles.get(i).getPrice();
            int indexMax = i;
            for (int j = i + 1; j < vehicles.size(); j++) {
                if (vehicles.get(j).getPrice() > maxPrice) {
                    maxPrice = vehicles.get(j).getPrice();
                    indexMax = j;
                }
            }
            if (indexMax != i) {
                Vehicle temp = vehicles.get(i);
                vehicles.set(i, vehicles.get(indexMax));
                vehicles.set(indexMax, temp);
            }
        }
    }

    public static void sortByAscendingYearOfIssue(Storable vehicles) {
        //method uses insert sort

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle element = vehicles.get(i);
            int indexToInsert = i;

            while (indexToInsert > 0
                    && vehicles.get(indexToInsert - 1).getYearOfIssue() > element.getYearOfIssue()) {
                vehicles.set(indexToInsert, vehicles.get(indexToInsert - 1));
                indexToInsert--;
                vehicles.set(indexToInsert, element);
            }
        }
    }
}
