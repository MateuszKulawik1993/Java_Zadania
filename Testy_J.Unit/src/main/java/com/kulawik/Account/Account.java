package com.kulawik.Account;

import com.kulawik.Address.Address;

public class Account {

    private boolean active;
    private Address defaultDeliveryAddress;

    public Account(){
        this.active=false;
    }
    public void activate(){
        this.active= true;
    }
    public boolean isActive(){
        return this.active;
    }

    public Address getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }
}
