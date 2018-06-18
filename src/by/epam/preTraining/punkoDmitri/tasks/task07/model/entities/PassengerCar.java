package by.epam.preTraining.punkoDmitri.tasks.task07.model.entities;

public class PassengerCar extends Vehicle {
    private int trunkSpace;

    public PassengerCar() {
    }

    public PassengerCar(byte numOfSeats, String color, String model, int yearOfIssue, int id,
                        int price, int trunkSpace) {
        super(numOfSeats, color, model, yearOfIssue, id, price);
        this.trunkSpace = trunkSpace;
    }

    public PassengerCar(PassengerCar passengerCar) {
        super(passengerCar.numOfSeats, passengerCar.color, passengerCar.model, passengerCar.yearOfIssue,
                passengerCar.id, passengerCar.price);
        this.trunkSpace = passengerCar.trunkSpace;
    }

    public int getTrunkSpace() {
        return trunkSpace;
    }

    public void setTrunkSpace(int trunkSpace) {
        this.trunkSpace = trunkSpace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerCar that = (PassengerCar) o;

        return getTrunkSpace() == that.getTrunkSpace();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getTrunkSpace();
        return result;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "trunkSpace=" + trunkSpace +
                ", numOfSeats=" + numOfSeats +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
