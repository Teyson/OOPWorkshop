/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopworkshop;

import java.util.UUID;

/**
 *
 * @author aalbaek-nt
 */
public class TemperatureSensor extends Sensor{
    private double value;

    public TemperatureSensor(UUID sensorId, String sensorName) {
        super(sensorId, sensorName);
        this.value = Math.random()*10+15;
    }
    
    
}
