package com.gla.Encapsulation;

abstract class VehicleRide {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleRide(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName);
    }
}
