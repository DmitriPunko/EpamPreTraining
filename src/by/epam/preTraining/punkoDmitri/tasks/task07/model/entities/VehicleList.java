package by.epam.preTraining.punkoDmitri.tasks.task07.model.entities;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.logic.Storable;

import java.util.Arrays;

public class VehicleList implements Storable {
    private Vehicle[] vehicles;
    private int size;

    public VehicleList() {
        vehicles = new Vehicle[size];
    }

    public VehicleList(Vehicle[] vehicles) {
        this.vehicles = vehicles;
        size = vehicles.length;
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
        return size == 0;
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
        vehicles = Arrays.copyOf(vehicles, ++size);
        vehicles[size - 1] = newVehicle;
    }

    public void add(Vehicle[] vehicles) {
        this.vehicles = Arrays.copyOf(this.vehicles, size + vehicles.length);

        for (int i = 0; i < vehicles.length; i++) {
            this.vehicles[size + i] = vehicles[i];
        }

        size += vehicles.length;
    }

    public Vehicle get(int index) {
        rangeCheck(index);

        return vehicles[index];
    }

    public void remove(int index) {
        rangeCheck(index);

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(vehicles, index+1, vehicles, index,
                    numMoved);
        vehicles[--size] = null;

    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            vehicles[i] = null;
        }
        size = 0;
    }

    public Vehicle[] toArray() {
        return vehicles;
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }
}
