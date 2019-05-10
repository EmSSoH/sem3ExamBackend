/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Magnus West Madsen
 */
@Entity
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Vehicle() {
    }
    
    public Vehicle(String numberplate, String brand, String fueltype, String gear, int year, String cartype, int seats, int doors, int price) {
        this.numberplate = numberplate;
        this.brand = brand;
        this.fueltype = fueltype;
        this.gear = gear;
        this.year = year;
        this.cartype = cartype;
        this.seats = seats;
        this.doors = doors;
        this.price = price;
    }

    public Vehicle(int id, String numberplate, String brand, String fueltype, String gear, int year, String cartype, int seats, int doors, int price) {
        this.id = id;
        this.numberplate = numberplate;
        this.brand = brand;
        this.fueltype = fueltype;
        this.gear = gear;
        this.year = year;
        this.cartype = cartype;
        this.seats = seats;
        this.doors = doors;
        this.price = price;
    }

    
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
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
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "entity.Vehicle[ id=" + id + " ]";
    }
    
}
