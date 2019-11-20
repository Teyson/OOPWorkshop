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
    UUID name;
    HashMap<UUID, Sensor> sensor = new HashMap<UUID, Sensor>();
    HashMap<UUID, Actuator> actuator = new HashMap<UUID, Actuator>();
    
    public Building (UUID id) {
        this.name = id;
    } 

    public UUID getName() {
        return name;
    }
    
    public void addSensor(Sensor sensorAdd) {
        sensor.put(sensorAdd.getSensorName(), sensorAdd);
    }
    
    public void addActuator (Actuator actuatorAdd) {
        actuator.put(actuatorAdd.getActuatorName(), actuatorAdd);
    }

    public HashMap<UUID, Sensor> getSensor() {
        return sensor;
    }

    public HashMap<UUID, Actuator> getActuator() {
        return actuator;
    }
    
    
}