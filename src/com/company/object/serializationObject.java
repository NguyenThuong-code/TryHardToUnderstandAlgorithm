package com.company.object;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serializationObject {
    public static void main(String[] args) {
        try {
            //Serialization for Import object into file
            //just only for the object in the file
            //creating the object
            Employee emp=new Employee(198054, "Andrew");
            //Creates a stream and writes the object
            FileOutputStream fout = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp);
            out.flush();
            //closes the output stream
            out.close();
            System.out.println("Successfully Created");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
