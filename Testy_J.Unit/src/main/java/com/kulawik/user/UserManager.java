package com.kulawik.user;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private final List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }
    public void addUser(String name){
        users.add(new User(name));
    }
    public boolean removeUser(String name){
        return users.remove(new User(name));
    }
    public User findUser(String name) {
        int index = users.indexOf(new User(name));
        return index >= 0 ? users.get(index) : null;
    }
    public List<User>getAllUsers(){
        return new ArrayList<>(users);
    }

}

