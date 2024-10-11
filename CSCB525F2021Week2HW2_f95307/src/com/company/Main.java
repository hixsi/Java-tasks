package com.company;

import com.company.checkpoint.Checkpoint;
import com.company.checkpoint.Vehicle;
import com.company.plastic.PlasticGoods;
import com.company.plastic.PlasticGoodsManufacturer;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(2000, 0);
        Vehicle vehicle2 = new Vehicle(2500, 1);

        Checkpoint checkpoint = new Checkpoint("Checkpoint1");
        checkpoint.addVehicle(vehicle1);
        checkpoint.addVehicle(vehicle2);

        checkpoint.checkingVehicles();

        PlasticGoods plasticGoods1 = new PlasticGoods("straw",0.02);
        PlasticGoods plasticGoods2 = new PlasticGoods("bottle",0.05);
        PlasticGoods plasticGoods3 = new PlasticGoods("bag",0.01);
        PlasticGoods plasticGoods4 = new PlasticGoods("container",0.05);

        PlasticGoodsManufacturer plasticGoodsManufacturer = new PlasticGoodsManufacturer("Manufacturer1");

        plasticGoodsManufacturer.addPlasticGoods(plasticGoods1);
        plasticGoodsManufacturer.addPlasticGoods(plasticGoods2);
        plasticGoodsManufacturer.addPlasticGoods(plasticGoods3);
        plasticGoodsManufacturer.addPlasticGoods(plasticGoods4);

        System.out.println( plasticGoodsManufacturer.averagePrice());
        System.out.println( plasticGoodsManufacturer.getGoodsWithGreaterPriceThanAVR());
        System.out.println( plasticGoodsManufacturer.getGoodsWithSmallerPriceThanAVR());
        System.out.println( plasticGoodsManufacturer.getPlasticItemWithAveragePrice());



    }
}
