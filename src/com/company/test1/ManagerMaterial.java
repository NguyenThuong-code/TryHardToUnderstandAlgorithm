package com.company.test1;

import com.company.hashCode.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ManagerMaterial {
    Scanner sc= new Scanner(System.in);

public void addFlourMaterial(List<Material> list){
    System.out.println("Enter Id Flour:");
    String id = sc.nextLine();
    System.out.println("Enter name flour: ");
    String name = sc.nextLine();
    System.out.println("Enter the date manufacturing");
    System.out.println("year");
    int y = sc.nextInt();
    System.out.println("month");
    int m = sc.nextInt();
    System.out.println("day");
    int d = sc.nextInt();
    LocalDate manufacturingDate = LocalDate.of(y, m, d);
    System.out.println("Enter cost:");
    int cost = sc.nextInt();
    System.out.println("Enter the quantity:");
    int quantity = sc.nextInt();
    CrispyFlour crispyFlour = new CrispyFlour(id, name, manufacturingDate, cost, quantity);
    list.add(crispyFlour);
}
    public void addMeatMaterial(List<Material> list){
        System.out.println("Enter Id meat:");
        String id = sc.nextLine();
        System.out.println("Enter name meat: ");
        String name = sc.nextLine();
        System.out.println("Enter the date manufacturing");
        System.out.println("year");
        int y = sc.nextInt();
        System.out.println("month");
        int m = sc.nextInt();
        System.out.println("day");
        int d = sc.nextInt();
        LocalDate manufacturingDate = LocalDate.of(y, m, d);
        System.out.println("Enter cost:");
        int cost = sc.nextInt();
        System.out.println("Enter the weight:");
        double weight = sc.nextDouble();
        Meat meat = new Meat(id, name, manufacturingDate, cost, weight);
        list.add(meat);
    }
    public void showListMaterial(List<Material> list){
        for (Material o:list
             ) {
            System.out.println(o);
        }
    }
    public void deleteMaterial(List<Material> list, int pos){
    for (int i=0; i<list.size(); i++){
        if (i==pos-1){
            list.remove(i);
            break;
        }
    }
        System.out.println("Remove Successfully!");
    }

    public void updateMaterial(List<Material> list, int pos) {
        for (int i = 0; i < list.size(); i++) {
            if (i == pos - 1) {
                System.out.println("Enter Id Flour:");
                String id = sc.nextLine();
                System.out.println("Enter name flour: ");
                String name = sc.nextLine();
                System.out.println("Enter the date manufacturing");
                System.out.println("year");
                int y = sc.nextInt();
                System.out.println("month");
                int m = sc.nextInt();
                System.out.println("day");
                int d = sc.nextInt();
                LocalDate manufacturingDate = LocalDate.of(y, m, d);
                System.out.println("Enter cost:");
                int cost = sc.nextInt();
//                System.out.println("Enter the quantity:");
//                int quantity = sc.nextInt();
                list.get(i).setId(id);
                list.get(i).setName(name);
//                list.get(manufacturingDate);
                /**----*/
                list.get(i).setCost(cost);
//                list.get(i).setQuantity(quantity);
                /**-------*/
                 break;

            }
        }
        System.out.println("Update successfully!");
    }
}
