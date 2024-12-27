package com.kulawik.ToDoList;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListToDoTest {

    @Test
    void addTask() {
        ListToDo listToDo=new ListToDo();
        listToDo.addTask("Coocking");
        assertEquals(List.of("Coocking"), listToDo.getTasks());

        listToDo.addTask("Take a shower");
        assertEquals(List.of("Coocking","Take a shower"), listToDo.getTasks());
    }
    @Test
    void addInvalidTask() {
        ListToDo listToDo=new ListToDo();
        Exception exception= assertThrows(IllegalArgumentException.class, ()->listToDo.addTask(""));
        assertEquals("Task cannot be empty",exception.getMessage());
    }

    @Test
    void ShouldCheckRemovingTaskWhenListIsNotEmpty() {
        ListToDo listToDo=new ListToDo();
        listToDo.addTask("Coocking");
        listToDo.addTask("Take a shower");
        listToDo.removeTask("Take a shower");

        assertEquals(List.of("Coocking"), listToDo.getTasks());
    }

    @Test
    void RemovingNonExistingTask(){
        ListToDo listToDo=new ListToDo();
        listToDo.addTask("Running");

        Exception exception= assertThrows(IllegalArgumentException.class,()->listToDo.removeTask("Move the Dog"));
        assertEquals("You cant'remove empty task.",exception.getMessage());
    }
    @Test
    public void TestGetTasks(){
        ListToDo listToDo=new ListToDo();
        listToDo.addTask("Eating");
        listToDo.addTask("Cleaning");
        List<String>tasks=listToDo.getTasks();
        assertEquals(List.of("Eating","Cleaning"), tasks);
        assertEquals(2,tasks.size());



    }




}