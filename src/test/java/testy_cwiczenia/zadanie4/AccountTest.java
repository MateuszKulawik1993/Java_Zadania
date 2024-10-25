package testy_cwiczenia.zadanie4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AccountTest {
    @Test
    void newlyCreatedAccountShouldNotBeActive(){
        //given
        Account account = new Account();
        //then
        assertFalse(account.isActive(),"Check if new account is not active");

    }
    @Test
    void activatedAccountShouldHaveActiveFlagSet(){
        //given
        Account account = new Account();
        //then
        assertFalse(account.isActive());
    }
    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAdress(){
        //given
        Account account = new Account();
        //when
        Adress adress = account.getDefaultDeliveryAdress();
        //then
        assertNull(adress);
    }
    @Test
    void defaultDeliveryAdressShouldNotBeNullAfterBeingSet(){
        //given
        Adress adress = new Adress("Krakowska","67c");
        Account account = new Account();
        account.setDefaultDeliveryAdress(adress);

        //when
        Adress defaultAdress = account.getDefaultDeliveryAdress();

        //then
        assertNotNull(defaultAdress);

    }
}
