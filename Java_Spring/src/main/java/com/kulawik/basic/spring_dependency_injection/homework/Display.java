package com.kulawik.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {
   public  void display(double value){
       System.out.println("Result is:" + value);
   }
}
