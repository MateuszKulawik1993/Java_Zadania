package com.kulawik.user;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    @Test
    void ShouldCheckAddedUsers() {
        //Given
        UserManager userManager= new UserManager();
        //when
         userManager.addUser("Klaudia");
        //then
        assertNotNull(userManager.findUser("Klaudia"));
    }


    @Test
    void CheckRemovedUserFromList() {
       //Given
        UserManager userManager=new UserManager();
        //When
        userManager.addUser("Klaudia");
        boolean result=userManager.removeUser("Klaudia");
        //then
        assertTrue(result);
        assertNull(userManager.findUser("Klaudia"));

    }

    @Test
    void testFindUser() {
        UserManager userManager = new UserManager();
        userManager.addUser("Charlie");

        User user = userManager.findUser("Charlie");
        assertNotNull(user);
        assertEquals("Charlie", user.getName());
    }

    @Test
    void testGetAllUsers() {
        UserManager userManager = new UserManager();
        userManager.addUser("David");
        userManager.addUser("Eve");

        assertEquals(2, userManager.getAllUsers().size());
        assertTrue(userManager.getAllUsers().stream()
                .anyMatch(user -> user.getName().equals("David")));
        assertTrue(userManager.getAllUsers().stream()
                .anyMatch(user -> user.getName().equals("Eve")));
    }
}