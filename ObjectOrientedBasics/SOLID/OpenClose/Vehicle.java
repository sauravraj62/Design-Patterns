package ObjectOrientedBasics.SOLID.OpenClose;

public class Vehicle {
    public int calculateValue() {
        return 0;
    }
}

public class Car extends Vehicle {
    public int calculateValue() {
        return calculatedValue;
    }
}

public class Truck extends Vehicle {
    public int calculateValue() {
        return calculatedValue;
    }
}
