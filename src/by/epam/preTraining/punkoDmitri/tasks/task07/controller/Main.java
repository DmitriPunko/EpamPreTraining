package by.epam.preTraining.punkoDmitri.tasks.task07.controller;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.logic.Searcher;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.logic.Sorter;
import by.epam.preTraining.punkoDmitri.tasks.task07.util.Creator;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.PassengerCar;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Truck;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Vehicle;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.logic.VehicleService;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.VehicleArray;
import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.VehicleList;
import by.epam.preTraining.punkoDmitri.tasks.task07.view.ConsolePrinter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        PassengerCar passengerCar = Creator.createPassengerCar();
//        Truck truck = Creator.createTruck();
//
//        Vehicle[] vehicles1 = {passengerCar, truck};
//        System.out.println("Vehicles: ");
//        System.out.println(Arrays.toString(vehicles1));
//
//        System.out.println("test dynamic container: ");
//        VehicleList vehicleList = new VehicleList();
//        vehicleList.add(vehicles1);
//
//        System.out.println("Size of vehicle list: " + vehicleList.size());
//        System.out.println("Is empty? " + vehicleList.isEmpty());
//        vehicleList.clear();
//        System.out.println("Is empty after clear? " + vehicleList.isEmpty());
//        vehicleList.add(passengerCar);
//        System.out.println("Size after added passenger car: " + vehicleList.size());
//        vehicleList.add(truck);
//        System.out.println("Size after added truck: " + vehicleList.size());
//        System.out.println("contains truck and passenger car? " + vehicleList.containsAll(vehicles1));
//        vehicleList.remove(1);
//        System.out.println("size after delete truck: " + vehicleList.size());
//        vehicleList.add(vehicles1[1]);
//        System.out.println();
//
//        System.out.println("test static container: ");
//
//        VehicleArray vehicleArray = new VehicleArray(vehicles1);
//
//        System.out.println("Size of vehicle array: " + vehicleArray.size());
//        System.out.println("Is empty? " + vehicleArray.isEmpty());
//        vehicleArray.clear();
//        System.out.println("Is empty after clear? " + vehicleArray.isEmpty());
//        System.out.println(vehicleArray.toString());
//        vehicleArray.add(passengerCar);
//        System.out.println("Size after added passenger car: " + vehicleArray.size());
//
//        System.out.println(vehicleArray.toString());
//        vehicleArray.add(truck);
//        System.out.println("Size after added truck: " + vehicleArray.size());
//        System.out.println(vehicleArray.toString());
//        System.out.println("contains truck and passenger car? " + vehicleArray.containsAll(vehicles1));
//        System.out.println(vehicleArray.toString());
//        vehicleArray.remove(1);
//        System.out.println("size after delete truck: " + vehicleArray.size());
//        System.out.println(vehicleArray.toString());
//        vehicleArray.add(vehicles1[1]);
//        System.out.println("After truck added");
//        System.out.println(vehicleArray.toString());
//        System.out.println();
//
//
//
//        System.out.println("test entities:");
//        System.out.println("test copy constructor: ");
//
//        PassengerCar copyCar = new PassengerCar(passengerCar);
//        System.out.println("copy passenger car: ");
//        ConsolePrinter.print(copyCar);
//
//        System.out.println("test  vehicle service: ");
//        VehicleService service = new VehicleService();
//
//        System.out.println("test total price");
//        System.out.println(Arrays.toString(vehicles1));
//        System.out.println("total price: " + service.findTotalPrice(vehicleArray) + "\n");
//
//        System.out.println("test getVehiclesYoungerThan");
//        VehicleList youngCars = service.getVehiclesYoungerThan(vehicleArray, 2000);
//        System.out.println("vehicles1 younger than 2000 year model");
//        ConsolePrinter.print(youngCars);
//
//        System.out.println("test find findVehiclesByModel");
//        VehicleList vehicleListWithSameModel = service.findVehicleByModel(vehicleArray, "BMW");
//        System.out.println("vehicles1 BMW model");
//        ConsolePrinter.print(vehicleListWithSameModel);

        System.out.println("--------------------------------  \n");
        System.out.println("test sorter");
        System.out.println("test bubble sort(Ascending of price)");

        VehicleList vehicleList1 = new VehicleList();

        for (int i = 0; i < 5; i++) {
            vehicleList1.add(Creator.createPassengerCar());
        }

        ConsolePrinter.print(vehicleList1);
        Sorter.sortByPriceAscending(vehicleList1);
        ConsolePrinter.print(vehicleList1);

        System.out.println("--------------------------------  \n");
        System.out.println("test selection sort(Descending of price)");

        vehicleList1 = new VehicleList();

        for (int i = 0; i < 5; i++) {
            vehicleList1.add(Creator.createPassengerCar());
        }

        ConsolePrinter.print(vehicleList1);
        Sorter.sortByPriceDescending(vehicleList1);
        ConsolePrinter.print(vehicleList1);


        System.out.println("--------------------------------  \n");
        System.out.println("test insert sort(Ascending of year of issue)");

        vehicleList1 = new VehicleList();

        for (int i = 0; i < 5; i++) {
            vehicleList1.add(Creator.createPassengerCar());
        }

        ConsolePrinter.print(vehicleList1);
        Sorter.sortByAscendingYearOfIssue(vehicleList1);
        ConsolePrinter.print(vehicleList1);

        System.out.println("--------------------------------  \n");
        System.out.println("test Searcher: ");

        vehicleList1 = new VehicleList();

        for (int i = 0; i < 5; i++) {
            vehicleList1.add(Creator.createPassengerCar());
        }

        System.out.println("test linear search: ");
        System.out.println("Finding vehicle with price  " + vehicleList1.get(3).getPrice());
        ConsolePrinter.print(Searcher.findByPrice(vehicleList1, vehicleList1.get(3).getPrice()));

        System.out.println("Finding vehicle with price  11111" );
        ConsolePrinter.print(Searcher.findByPrice(vehicleList1, 11111));

        System.out.println("--------------------------------  \n");
        System.out.println("test binary search: ");
        System.out.println("Finding vehicle with year of issue " + vehicleList1.get(4).getYearOfIssue());
        ConsolePrinter.print(Searcher.findByYearOfIssue(vehicleList1, vehicleList1.get(4).getYearOfIssue()));


        System.out.println("Finding vehicle with year of issue 2004");
        ConsolePrinter.print(Searcher.findByYearOfIssue(vehicleList1, 2004));

    }
}
