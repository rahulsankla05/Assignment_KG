package org.example.services;
import org.example.exceptions.PassNotFoundException;
import org.example.exceptions.VehicleNotFoundException;
import org.example.models.*;
import java.util.HashMap;
import java.util.Map;
public class VehicleService {
    private Map<String, Toll_Pass> passMap;
    private Map<String, Vehicle> vehicle;
    public VehicleService(){
        this.passMap=new HashMap<>();
        this.vehicle=new HashMap<>();
    }
    public Toll_Pass getPassMap(String vehicle_Id){
        if(!passMap.containsKey(vehicle_Id)){
            throw new PassNotFoundException();
        }
        return passMap.get(vehicle_Id);     // making entry of vehicle in pass using vehicle_Id //
    }
    public void addPassMap(String id, Toll_Pass toll_pass){
        this.passMap.put(id,toll_pass);
    }
    public void addVehicle(String id, Vehicle vehicle){
        this.vehicle.put(id,vehicle);
    }
    public Vehicle getVehicle(String id){
        if(!vehicle.containsKey(id)){
            throw new VehicleNotFoundException();
        }
        return vehicle.get(id);
    }
}