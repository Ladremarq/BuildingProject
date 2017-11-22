/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lasse
 */
public class System {
    
    //removeBuilding
    List<Building> Buildings = new ArrayList<>();
    
    public void addBuilding(String Name, double Longdi, double lati){
        Buildings.add(new Building(Name, Longdi, lati));
    }
    public void removeBuilding(String Name){
        for (int i = -1; Buildings.size() > i; i++){
        if (Building.class.getName() = Name){
            Buildings.remove(i);
        }
    }
    
    }
}
