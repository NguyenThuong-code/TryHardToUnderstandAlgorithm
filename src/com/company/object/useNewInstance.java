package com.company.object;

public class useNewInstance {
    void show() {
        System.out.println("A new object created");
    }

    public static void main(String[] args) {
try {
    //creating an instance of Class class
    Class cls= Class.forName("Using new Instance");
    //creates an instance of the class using newInstance() method
    useNewInstance obj=(useNewInstance) cls.newInstance();
    obj.show();
//invoking the show() method
}catch (ClassNotFoundException e){
    e.printStackTrace();
}catch (InstantiationException e){
    e.printStackTrace();
}catch (IllegalAccessException e) {
    e.printStackTrace();
}
    }
}