package se.lexicon.skovde.models;

public class Car {
    private String brand;
    private String modelName;

    private int fuelLevel;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void consumeFuel(int fuel) throws OutOfFuelException {
        if (fuelLevel - fuel >= 0)
        {
            this.fuelLevel -= fuel;
        }
        else {
            OutOfFuelException ex = new OutOfFuelException();

            ex.setFuelReq(Math.abs(fuelLevel - fuel));

            throw ex;
        }

    }

    public void refuel(int fuel)
    {
        this.fuelLevel += fuel;
    }
}
