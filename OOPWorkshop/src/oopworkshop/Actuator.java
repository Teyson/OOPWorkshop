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
    private UUID actuatorID;
    private int actuatorValue;
    private String actuatorType;

    public Actuator(UUID actuatorID, int actuatorValue, String actuatorType) {
        this.actuatorID = actuatorID;
        this.actuatorValue = actuatorValue;
        this.actuatorType = actuatorType;
    }
    
    
}
