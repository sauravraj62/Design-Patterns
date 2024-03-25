package ObjectOrientedBasics.SOLID.InterfaceSeggregation;

// Interface for a generic device
interface Device {
    void turnOn();

    void turnOff();

    void print();

    void scan();

    void fax();
}

// Printer interface
interface Printer {
    void print();
}

// Scanner interface
interface Scanner {
    void scan();
}

// Fax machine interface
interface Fax {
    void fax();
}

// A multifunction printer that implements all three interfaces
class MultiFunctionPrinter implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off...");
    }
}

// A simple printer that implements only the Printer interface
class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
