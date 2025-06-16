package com.freightpulse.api.service;

 
// Create a service class for managing Shipments. Include methods to save a shipment and get all shipments using ShipmentRepository.
import com.freightpulse.api.model.Shipment;
import com.freightpulse.api.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    
    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public Shipment saveShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}