package com.kulawik.basic.dependency_injection.homework;

public class DefaultDeliveryService implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
       if(weight>30){
           System.out.println("It is to heavy");
           return false;
       }else{
           System.out.println("Delivery in progress");
           return true;
       }
    }
}
