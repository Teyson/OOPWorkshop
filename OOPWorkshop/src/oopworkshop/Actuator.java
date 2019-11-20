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
public class Actuator {
    private UUID actuatorName;
    private int actuatorValue;
    private String actuatorType;

    public Actuator(UUID actuatorName, int actuatorValue, String actuatorType) {
        this.actuatorName = actuatorName;
        this.actuatorValue = actuatorValue;
        this.actuatorType = actuatorType;
    }

    public UUID getActuatorID() {
        return actuatorID;
    }

    public int getActuatorValue() {
        return actuatorValue;
    }

    public void setActuatorValue(int actuatorValue) {
        this.actuatorValue = actuatorValue;
    }

    public String getActuatorType() {
        return actuatorType;
    }

    public void setActuatorType(String actuatorType) {
        this.actuatorType = actuatorType;
    }
    
    
    
    
}
