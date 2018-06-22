package by.epam.preTraining.punkoDmitri.tasks.task07.model.logic;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Vehicle;

public class Searcher {

    public static Vehicle findByPrice(Storable vehicles, int price) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPrice() == price) {
                return vehicles.get(i);
            }
        }
        return null;
    }

    public static Vehicle findByYearOfIssue(Storable vehicles, int yearOfIssue) {
        Sorter.sortByAscendingYearOfIssue(vehicles);
        return binarySearch(vehicles, yearOfIssue);
    }

    private static Vehicle binarySearch(Storable vehicles, int yearOfIssue) {
        int left = 0;
        int right = vehicles.size();
        int mid = 0;

        while (!(left >= right)) {
            mid = left + (right - left) / 2;

            if (vehicles.get(mid).getYearOfIssue() == yearOfIssue) {
                return vehicles.get(mid);
            }

            if (vehicles.get(mid).getYearOfIssue() > yearOfIssue) {
                right = mid;
            } else  {
                left = mid + 1;
            }
        }

        return null;
    }
}
