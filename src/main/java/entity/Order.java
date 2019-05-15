/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Magnus West Madsen
 */
@Entity
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    private final List<Vehicle> vehicle = new ArrayList();

    public Order() {
    }

    public Order(int id, User user) {
        this.id = id;
        this.user = user;
    }

    public Order(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Entitys.Order[ id=" + id + " ]";
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void addVehicle(Vehicle v) {
        this.vehicle.add(v);
    }
}
