package com.company.object;

public class usingClone implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException{
        //invokes the clone() method of the super class
        return super.clone();
    }
    String str="New Object Created";

    public static void main(String[] args) {
        //creating an object of the class
        usingClone obj=new usingClone();
        //try catch block to catch the exception thrown by the method
        try{
            //creating the new object of the obj1 using the clone()method
            usingClone obj2=(usingClone) obj.clone();
            System.out.println(obj2.str);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
