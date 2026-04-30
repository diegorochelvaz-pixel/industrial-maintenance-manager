package com.diegorochel.maintenance.service;

/**
 * @author Diego Rochel
 */

import com.diegorochel.maintenance.model.Equipment;
import com.diegorochel.maintenance.repository.EquipmentRepository;

import java.util.List;

public class EquipmentService {

    private EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }

    //CREATE
    public void createEquipment(Equipment equipment) {

        if (equipment.getName() == null || equipment.getName().isEmpty()) {
            System.out.println("Error: equipment name is null or empty");
            return;
        }

        if (repository.findById(equipment.getId()) != null) {
            System.out.println("Error: equipment already exists");
            return;
        }

        repository.addEquipment(equipment);
        System.out.println("Equipment created successfully");
    }

    // READ
    public List<Equipment> getAllEquipments() {
        return repository.getAllEquipments();
    }

    // DELETE
    public void deleteEquipment(int id) {

        boolean removed = repository.removeById(id);

        if (removed) {
            System.out.println("Equipment deleted sucessfully!");

        } else {
            System.out.println("Equipment not found.");
        }
    }

    //SEARCH
    public Equipment findEquipmentById(int id) {

        Equipment equipment = repository.findById(id);

        if (equipment == null) {
            System.out.println("Equipment not found.");
        }

        return equipment;
    }
}

