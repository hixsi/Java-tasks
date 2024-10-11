package com.company.checkpoint;

import java.util.PriorityQueue;
import java.util.Queue;

public class Checkpoint {
    Queue<Vehicle> vehicleQueue;
    String name;

    public Checkpoint(String name) {
        this.vehicleQueue = new PriorityQueue<>(Vehicle.comparatorByEmergency.reversed().thenComparing(Vehicle.comparatorByWeight));
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicleQueue.add(vehicle);
    }

    public void checkingVehicles(){
        if(vehicleQueue.isEmpty())
            System.out.println("No vehicles");
        else
            while(this.vehicleQueue.peek() != null)
                System.out.println(this.vehicleQueue.poll() + ":is checked!");
    }
}
