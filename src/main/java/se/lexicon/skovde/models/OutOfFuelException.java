package se.lexicon.skovde.models;

public class OutOfFuelException extends Exception {
    private int fuelReq;

    public int getFuelReq() {
        return fuelReq;
    }

    public void setFuelReq(int fuelReq) {
        this.fuelReq = fuelReq;
    }
}
