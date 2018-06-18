package by.epam.preTraining.punkoDmitri.tasks.task07.model.entities;

public class Truck extends Vehicle {
    private int loadCapacity;
    private int numOfAxles;

    public Truck() {
    }

    public Truck(byte numOfSeats, String color, String model, int yearOfIssue, int id, int price,
                 int loadCapacity, int numOfAxles) {
        super(numOfSeats, color, model, yearOfIssue, id, price);
        this.loadCapacity = loadCapacity;
        this.numOfAxles = numOfAxles;
    }

    public Truck(Truck truck) {
        super(truck.numOfSeats, truck.color, truck.model, truck.yearOfIssue, truck.id, truck.price);
        this.loadCapacity = loadCapacity;
        this.numOfAxles = numOfAxles;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumOfAxles() {
        return numOfAxles;
    }

    public void setNumOfAxles(int numOfAxles) {
        this.numOfAxles = numOfAxles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        if (getLoadCapacity() != truck.getLoadCapacity()) return false;
        return getNumOfAxles() == truck.getNumOfAxles();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getLoadCapacity();
        result = 31 * result + getNumOfAxles();
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", numOfAxles=" + numOfAxles +
                ", numOfSeats=" + numOfSeats +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", id=" + id +
                '}';
    }
}
