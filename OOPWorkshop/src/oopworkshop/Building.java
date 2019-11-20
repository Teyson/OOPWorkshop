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
public class Building {
    UUID id;
    String name;
    HashMap<UUID, Sensor> sensor = new HashMap<UUID, Sensor>();
    HashMap<UUID, Actuator> actuator = new HashMap<UUID, Actuator>();
    String information;
    
    public void Building (UUID id, String name) {
        this.id = id;
        this.name = name;
        
    } 

    public String getName() {
        return name;
    }
    
    public UUID getId() {
        return id;
    } 
    
    public void addSensor(Sensor sensorAdd) {
        sensor.put(sensorAdd.getSensorId(), sensorAdd);
    }
    
    public void addActuator (Actuator actuatorAdd) {
        actuator.put(actuatorAdd.getActuatorName(), actuatorAdd);
    }
}