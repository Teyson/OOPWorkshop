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
    
    public void Building (UUID id) {
        this.name = id;
    } 

    public UUID getName() {
        return name;
    }
    
    public void addSensor(Sensor sensor) {
        sensor.put(sensor.getSensorName, this.Building(this.name));
    }
    
    public void addActuator (Actuator actuator) {
        sensor.put(actuator.getActuatorName, this.Building(this.name));
    }
}
