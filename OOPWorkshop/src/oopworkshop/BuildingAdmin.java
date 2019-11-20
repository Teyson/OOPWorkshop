/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopworkshop;

import java.util.HashMap;
import java.util.UUID;


public class BuildingAdmin {
      
    private HashMap<UUID, Building> buildings = new HashMap<>();
    
   public BuildingAdmin() {
   }
  
public void addBuilding(Building building) {
    buildings.put(building.getId(), building);
}
public void removeBuilding (Building building) {
    buildings.remove(building.getId());
}

public void setBuidlings(HashMap<UUID, Building> buildings){
    this.buildings = buildings;
}

public HashMap<UUID, Building> getBuildings() {
    return buildings;
}
}



