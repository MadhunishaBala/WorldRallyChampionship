package com.example.worldrallychampionship;
public class Driver {  //This class represents the data held by each driver
    private int licenseNum;
    private String driverName;
    private int driverAge;
    private String driverTeam;
    private String driverCar;
    private int currentPoints;

    public Driver(int licenseNum, String driverName, int driverAge, String driverTeam, String driverCar, int currentPoints) {
        this.licenseNum = licenseNum;
        this.driverName = driverName;
        this.driverAge = driverAge;
        this.driverTeam = driverTeam;
        this.driverCar = driverCar;
        this.currentPoints = currentPoints;
    }

    public int getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(int licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    public String getDriverTeam() {
        return driverTeam;
    }

    public void setDriverTeam(String driverTeam) {
        this.driverTeam = driverTeam;
    }

    public String getDriverCar() {
        return driverCar;
    }

    public void setDriverCar(String driverCar) {
        this.driverCar = driverCar;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }
}
