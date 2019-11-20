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
public class Sensor {
    private UUID SensorId;
    private String SensorName;
    

    public Sensor(UUID sensorId, String sensorName) {
        this.SensorName = sensorName;
        this.SensorId = sensorId;
    }

    public UUID getSensorId() {
        return SensorId;
    }
    
    public String getSensorName() {
        return SensorName;
    }

    /*public void setSensorName(UUID SensorName) {
        this.SensorName = SensorName;
    }
    */

}
