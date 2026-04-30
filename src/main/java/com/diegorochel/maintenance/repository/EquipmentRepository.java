package com.diegorochel.maintenance.repository;

/**
 * @author Diego Rochel
 */

import com.diegorochel.maintenance.model.Equipment;
import java.util.List;
import java.util.ArrayList;

public class EquipmentRepository {

    private List<Equipment> equipmentList =  new ArrayList<>();

    // CREATE (C)
    public void addEquipment(Equipment equipment){
        equipmentList.add(equipment);
    }

    // READ (R)
    public List<Equipment> getAllEquipments(){
        return equipmentList;
    }

    // SEARCH BY ID
    public Equipment findById(int id){
        for (Equipment equipment : equipmentList){
            if(equipment.getId() == id){
                return equipment;
            }
        }
        return null;
    }

    // DELETE
    public boolean removeById(int id){
        Equipment equipment = findById(id);
        if (equipment != null){
            equipmentList.remove(equipment);
            return true;
        }
        return false;

    }

}
