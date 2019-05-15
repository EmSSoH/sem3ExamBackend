/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entity.Order;
import entity.User;
import entity.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Magnus West Madsen
 */
public class OrderDTO {

    private int id;
    private User user;

    private List<Vehicle> vehicle = new ArrayList();

    public OrderDTO() {
    }

    public OrderDTO(Order o) {
        this.id = o.getId();
        this.user = o.getUser();

        this.vehicle = o.getVehicle();
    }

    public int getId() {
        return id;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
