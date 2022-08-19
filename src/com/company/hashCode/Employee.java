package com.company.hashCode;

public class Employee {
    private int regno;
    private String name;

    //Cóntructor employee class
    public Employee(int regno, String name){
        this.name =name;
        this.regno= regno;
    }
    public  int getRegno(){
        return regno;
    }
    public void  setRegno(int Regno){
        this.regno= regno;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public boolean equals(Object obj){
        if (obj== null)
            return true;
        if(obj== this)
            return false;
       return  this.getRegno()==((Employee)obj).getRegno();
    }
}

