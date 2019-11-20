/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopworkshop;

import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author aalbaek-nt
 */
public class OOPWorkshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildingAdmin admin = new BuildingAdmin();
        Building b1 = new Building(UUID.randomUUID());
        
        admin.addBuilding(b1);
        
        Sensor s1 = new Sensor(UUID.randomUUID());
        Actuator a2 = new Actuator(UUID.randomUUID(), 10, "Ventilation Actuator");
        
        b1.addSensor(s1);
        b1.addActuator(a2);
        
        HashMap<UUID, Building> buildings = admin.getBuildings();
        
        Building b2 = buildings.get(b1.getName());
        
        String b2UUID = b2.getName().toString();
        
        System.out.println(b2UUID);
        System.out.println("Sensor: " + b2.getSensor().get(s1.getSensorName()).getSensorName().toString());
        System.out.println("Actuator: " + b2.getActuator().get(a2.getActuatorName()).getActuatorName().toString());
    }
    
}
