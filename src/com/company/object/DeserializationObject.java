package com.company.object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationObject {
    public static void main(String[] args) {
        try {
            //Deserialization read file from the seiral import
            ObjectInputStream in= new ObjectInputStream(new FileInputStream("employee.txt"));
            //InputStream is mean that import Object into file to load
            Employee e= (Employee)in.readObject();
            //read Object to read the object in the file.
            //prints the data of the serialized object
            System.out.println(e.empid+" "+e.empname);
            //closing the input stream
            in.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
