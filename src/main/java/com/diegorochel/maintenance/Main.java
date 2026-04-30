package com.diegorochel.maintenance;

import com.diegorochel.maintenance.model.Equipment;
import com.diegorochel.maintenance.repository.EquipmentRepository;
import com.diegorochel.maintenance.service.EquipmentService;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EquipmentRepository repository = new EquipmentRepository();
        EquipmentService equipmentService = new EquipmentService(repository);

        Equipment eq1 = new Equipment(
                1,
                "Lathe Machine",
                "Machining",
                "Siemens",
                "HIGH",
                "ACTIVE"
        );

        Equipment eq2 = new Equipment(
                2,
                "Hydraulic Press",
                "Assembly",
                "Bosch",
                "MEDIUM",
                "ACTIVE"
        );

        equipmentService.createEquipment(eq1);
        equipmentService.createEquipment(eq2);

        System.out.println("\n--- LIST OF EQUIPMENTS ---");

        equipmentService.getAllEquipments().forEach(System.out::println);

        System.out.println("\n--- SEARCH EQUIPMENT ID 1");
        System.out.println(equipmentService.findEquipmentById(1));

        System.out.println("\n--- DELETE EQUIPMENT ID 2");
        equipmentService.deleteEquipment(2);

        System.out.println("\n--- FINAL LIST OF EQUIPMENTS ---");
        equipmentService.getAllEquipments().forEach(System.out::println);


    }
}