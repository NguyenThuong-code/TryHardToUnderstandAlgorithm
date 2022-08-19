package com.company.object;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class constructorNewInstance {
    private  String str;
    constructorNewInstance(){

    }
    public void setName(String str){
        this.str=str;
    }

    public static void main(String[] args) {
        try {
            Constructor<constructorNewInstance> constructor= constructorNewInstance.class.getDeclaredConstructor();
            constructorNewInstance r = constructor.newInstance();
            r.setName("JavaTPoint");
            System.out.println(r.str);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
