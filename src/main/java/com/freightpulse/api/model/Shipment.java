package com.freightpulse.api.model;

// Define a JPA entity for Shipment with id, origin, destination, carrier, cost, status, and estimatedDelivery
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "shipments")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origin;
    private String destination;
    private String carrier;
    private Double cost;
    private String status;
    private LocalDate estimatedDelivery;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getCarrier() {
        return carrier;
    }

    public Double getCost() {
        return cost;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getEstimatedDelivery() {
        return estimatedDelivery;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEstimatedDelivery(LocalDate estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }
}