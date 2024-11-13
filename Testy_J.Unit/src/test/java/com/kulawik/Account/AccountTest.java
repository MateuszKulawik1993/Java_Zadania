package com.kulawik.Account;

import com.kulawik.Address.Address;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
   public void NewAccountShouldBeNotActiveAfterCreation(){
        //given
        Account account = new Account();
        //then
        assertFalse(account.isActive());
    }
   @Test
   public void AccountShouldBeActiveAfterActivation(){
        //given
        Account account =new Account();
        //when
        account.activate();
        //then
        assertTrue(account.isActive());
   }
   @Test
    public void newlyCreatedShouldNotHaveDefaultAddressSet(){
        //give
       Account account = new Account();
       //when
       Address address = account.getDefaultDeliveryAddress();
       //then
       assertNull(address);
    }
    @Test
    public void defaultDeliveryAddressShouldNotBeNullAfterBeingSet(){
        //given
        Address address = new Address("37c","Krakowska");
        Account account = new Account();
        //when
        account.setDefaultDeliveryAddress(address);
        //when
        Address defaultAddress =account.getDefaultDeliveryAddress();
        //then
        assertNotNull(defaultAddress);
    }






}