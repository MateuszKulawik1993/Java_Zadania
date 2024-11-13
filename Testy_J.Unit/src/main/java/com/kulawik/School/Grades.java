package com.kulawik.School;

public class Grades {
    public int [] values;
    public int size = 0;

    public Grades() {
        this.size = 0;
        this.values = new int[0];
    }
    public void add(int value){
        this.size++;
        int[]newTab = new int[this.size];
        System.arraycopy(values,0,newTab,0, values.length );
        newTab[this.size-1]=value;
        this.values= newTab;
    }

    public int[] getValues(){
        return values;
    }
    public double getAverage(){
        if(this.values.length==0){
            return 0;
        }
        double sum=0;
        for(int i = 0; i< this.values.length;i++){
            sum = sum +this.values[i];
        }
        return sum/this.values.length;
    }
}
