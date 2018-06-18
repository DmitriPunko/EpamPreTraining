package by.epam.preTraining.punkoDmitri.tasks.task07.model.entities;

public class Vehicle {
    protected byte numOfSeats;
    protected String color;
    protected String model;
    protected int yearOfIssue;
    protected int id;
    protected int price;

    public Vehicle() {
    }

    public Vehicle(byte numOfSeats, String color, String model, int yearOfIssue, int id, int price) {
        this.numOfSeats = numOfSeats;
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.id = id;
        this.price = price;
    }


    public Vehicle(Vehicle vehicle) {
        this(vehicle.numOfSeats, vehicle.color, vehicle.model, vehicle.yearOfIssue, vehicle.id, vehicle.price);
    }

    public byte getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(byte numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (getNumOfSeats() != vehicle.getNumOfSeats()) return false;
        if (getYearOfIssue() != vehicle.getYearOfIssue()) return false;
        if (getId() != vehicle.getId()) return false;
        if (getPrice() != vehicle.getPrice()) return false;
        if (!getColor().equals(vehicle.getColor())) return false;
        return getModel().equals(vehicle.getModel());
    }

    @Override
    public int hashCode() {
        int result = (int) getNumOfSeats();
        result = 31 * result + getColor().hashCode();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getYearOfIssue();
        result = 31 * result + getId();
        result = 31 * result + getPrice();
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numOfSeats=" + numOfSeats +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
