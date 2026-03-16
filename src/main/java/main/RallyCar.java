package main;

// Abstract RallyCar class representing a generic rally car
public abstract class RallyCar {
    protected String make;
    protected String model;
    protected int horsePower;

    // Constructor
    public RallyCar (String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    // Abstract method to calculate performance, to be implemented by subclasses
    public abstract double calculatePerformance();

} // End of RallyCar

// GravelCar class representing a rally car designed for gravel surfaces
class GravelCar extends RallyCar {
    private double suspensionTravel;

    public GravelCar(String make, String model, int horsePower, double suspensionTravel) {
        super(make, model, horsePower);
        this.suspensionTravel = suspensionTravel;
    }

    // Getter for suspension travel
    public double getSuspensionTravel() {
        return suspensionTravel;
    }

    // Performance calculation for gravel cars
    public double calculatePerformance() {
        return horsePower * 1.1 + suspensionTravel * 3;
    }
}   // End of GravelCar

// AsphaltCar class representing a rally car designed for asphalt surfaces
class AsphaltCar extends RallyCar {
    private double downforce;

    public AsphaltCar(String make, String model, int horsePower, double downforce) {
        super(make, model, horsePower);
        this.downforce = downforce;
    }

    // Getter for downforce
    public double getDownforce() {
        return downforce;
    }

    // Performance calculation for asphalt cars
    public double calculatePerformance() {
        return horsePower * 1.15 + downforce * 5;
    }
} // End of AsphaltCar  
