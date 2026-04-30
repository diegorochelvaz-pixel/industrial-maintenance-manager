package com.diegorochel.maintenance.model;
/**
 * @author Diego Rochel
 */

public class Equipment {
    private int id;
    private String name;
    private String sector;
    private String manufacturer;
    private String criticality;
    private String Status;

    public Equipment(int id, String name, String sector, String manufacturer, String criticality, String status) {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.manufacturer = manufacturer;
        this.criticality = criticality;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<0) {
            System.out.println("ERROR, THERE'S NO NEGATIVE ID!");
        }else
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getStatus() {
        return manufacturer;
    }

    public void setStatus(String status) {
        this.manufacturer = status;
    }

    public String getCriticality() {
        return criticality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", criticality='" + criticality + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}

