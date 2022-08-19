package com.company.hashCode;

public class Main {

    public static void main(String[] args) {
Employee emp1= new Employee(918, "Maria");
Employee emp2= new Employee(918, "Maria");
// invoking hashCode() method
        int a = emp1.hashCode();
        int b= emp2.hashCode();
        System.out.println("hashcode of Emp1="+a);
        System.out.println("hashCode of emp2="+b);
        System.out.println("comparing objects emp1 and emp2 "+emp1.equals(emp2));
    }
}
