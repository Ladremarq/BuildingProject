/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;


/**
 *
 * @author Lasse
 */
public class Building {
    public String name;
    Location location;
    
    //List of rooms
    //Room[] roomList;
    
    public Building(String Name, double longdi, double lati){
        this.name = Name;
        this.location = new Location(longdi, lati);
    }
    
}
