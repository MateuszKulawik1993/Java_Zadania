package com.kulawik.ToDoList;

import java.util.ArrayList;
import java.util.List;

public class ListToDo {
    private final List<String> tasks=new ArrayList<>();

    public void addTask(String task){
        if(task==null|| task.trim().isEmpty()){
            throw new IllegalArgumentException("Task cannot be empty");
        }
        tasks.add(task);
    }
    public void removeTask(String task){
        if(!tasks.remove(task)){
            throw new IllegalArgumentException("You cant'remove empty task.");
        }
    }

    public List<String>getTasks() {
        List<String> task = new ArrayList<>();
        return tasks;
    }

}

