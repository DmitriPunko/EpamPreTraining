package by.epam.preTraining.punkoDmitri.tasks.task07.model.entities;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.logic.Storable;

public class VehicleService {

    public VehicleList getVehiclesYoungerThan(Storable vehicles, int year) {

        if (vehicles instanceof VehicleList) {
            vehicles = (VehicleList) vehicles;
        } else {
            vehicles = (VehicleArray) vehicles;
        }

        VehicleList youngVehicles = new VehicleList();

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) != null) {
                if (vehicles.get(i).getYearOfIssue() > year) {
                    youngVehicles.add(vehicles.get(i));
                }
            }
        }

        return youngVehicles;
    }

    public int findTotalPrice(Storable vehicles) {
        int totalPrice = 0;

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) != null) {
                totalPrice += vehicles.get(i).getPrice();
            }
        }

        return totalPrice;
    }

    public VehicleList findVehicleByModel(Storable vehicles, String model) {
        VehicleList vehicleListWithSameModel = new VehicleList();

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) != null) {
                if (vehicles.get(i).getModel().equals(model)) {
                    vehicleListWithSameModel.add(vehicles.get(i));
                }
            }
        }

        return vehicleListWithSameModel;
    }
}
