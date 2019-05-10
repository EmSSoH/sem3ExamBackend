/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entity.Vehicle;

/**
 *
 * @author Magnus West Madsen
 */
public class VehicleDTO {
    
    private int id;
    
    private String numberplate;
    private String brand;
    private String fueltype;
    private String gear;
    private int year;
    private String cartype;
    private int seats;
    private int doors;
    private int price;

    public VehicleDTO() {
    }

    public VehicleDTO(Vehicle v) {
        this.id = v.getId();
        this.numberplate = v.getNumberplate();
        this.brand = v.getBrand();
        this.fueltype = v.getFueltype();
        this.gear = v.getGear();
        this.year = v.getYear();
        this.cartype = v.getCartype();
        this.seats = v.getSeats();
        this.doors = v.getDoors();
        this.price = v.getPrice();
    }

    public int getId() {
        return id;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public String getBrand() {
        return brand;
    }

    public String getFueltype() {
        return fueltype;
    }

    public String getGear() {
        return gear;
    }

    public int getYear() {
        return year;
    }

    public String getCartype() {
        return cartype;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}
