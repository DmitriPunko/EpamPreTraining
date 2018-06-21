package by.epam.preTraining.punkoDmitri.tasks.task07.model.entities;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.logic.Storable;

import java.util.Arrays;

public class VehicleArray implements Storable {
    private Vehicle[] vehicles;
    private final int size;
    private int currentIndexOfFreeCell;


    public VehicleArray(Vehicle[] vehicles) {
        this(vehicles.length);
        add(vehicles);
    }

    public VehicleArray(int size) {

        if (size > 0) {
            this.size = size;
            this.vehicles = new Vehicle[size];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        }
    }

    @Override
    public String toString() {
        return "VehicleList{" +
                "vehicles=" + Arrays.toString(vehicles) +
                '}';
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                return false;
            }
        }
        return true;
    }


    public boolean contains(Vehicle vehicle) {
        return indexOf(vehicle) >= 0;
    }

    public boolean containsAll(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            if (!contains(v)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(Vehicle vehicle) {
        if (vehicle == null) {
            for (int i = 0; i < size; i++)
                if (vehicles[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (vehicle.equals(vehicles[i]))
                    return i;
        }
        return -1;
    }

    public void add(Vehicle newVehicle) {
        if (currentIndexOfFreeCell >= 0 && currentIndexOfFreeCell < size) {
            vehicles[currentIndexOfFreeCell] = newVehicle;
            currentIndexOfFreeCell++;
        }
    }

    public void add(Vehicle[] vehicles) {

        if (currentIndexOfFreeCell >= 0 && currentIndexOfFreeCell < size
                && vehicles.length <= size - currentIndexOfFreeCell) {
            for (int i = 0; i < vehicles.length; i++) {
                this.vehicles[currentIndexOfFreeCell + i] = vehicles[i];
            }
            currentIndexOfFreeCell += vehicles.length;
        } else {
            throw new IllegalArgumentException("Length of argument is bigger than number of free cells");
        }
    }

    public Vehicle get(int index) {
        rangeCheck(index);

        return vehicles[index];
    }

    public void set(int index, Vehicle element) {
        rangeCheck(index);
        vehicles[index] = element;
    }

    public void remove(int index) {
        rangeCheck(index);

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(vehicles, index + 1, vehicles, index,
                    numMoved);
        } else if (numMoved == 0) {
            vehicles[currentIndexOfFreeCell - 1] = null;
        }
        currentIndexOfFreeCell--;
    }

    public void clear() {
        for (int i = 0; i < currentIndexOfFreeCell; i++) {
            this.vehicles[i] = null;
        }
        currentIndexOfFreeCell = 0;
    }

    public Vehicle[] toArray() {
        return vehicles;
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }
}
