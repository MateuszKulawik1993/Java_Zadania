package com.kulawik.Streamy.user;

import Streamy.user.User;
import Streamy.user.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    void testFilterChemistsGroupNames() {
        // given& when
        List<String> chemistsUsernames = UsersManager.filterChemistsGroupNames();

       //then
        assertEquals(2, chemistsUsernames.size());
        assertTrue(chemistsUsernames.contains("Walter White"));
        assertTrue(chemistsUsernames.contains("Gale Boetticher"));
    }

    @Test
    void testFilterUsersOlderThen40(){
        //given & when
        int age = 40;
        List<User>usersOlderThen40 = UsersManager.filterUsersOlderThen40(age);
        //then
        assertTrue(usersOlderThen40.stream().allMatch(user -> user.getAge()>age));

    }
    @Test
    void testFilterInActiveUsers(){
        //given & when
        List<String>inactiveUsers = UsersManager.filerInActiveUsers();

        assertEquals(2,inactiveUsers.size());
        assertTrue(inactiveUsers.contains("Mike Ehrmantraut"));
        assertTrue(inactiveUsers.contains("Gus Firing"));

    }
}