package com.company.test1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {

        List<Material> list=new ArrayList<>();
        list.add(new CrispyFlour("1", "Plain", LocalDate.of(2021, 12, 5), 230, 4));
        list.add(new CrispyFlour("2","Rice", LocalDate.of(2021,9,5), 200, 3));
        list.add(new CrispyFlour("3","Bread", LocalDate.of(2021,11,6), 240, 5));
        list.add(new CrispyFlour("4","Baking", LocalDate.of(2022,2,9), 250, 7));
        list.add(new CrispyFlour("5","Cornflour", LocalDate.of(2022,7,19), 245, 9));

        list.add(new Meat("6", "Beef", LocalDate.of(2022, 8, 10),145, 2));
        list.add(new Meat("7", "chicken", LocalDate.of(2022, 8, 8),157, 5));
        list.add(new Meat("8", "pork", LocalDate.of(2022, 8, 15),140, 8));
        list.add(new Meat("9", "lamb", LocalDate.of(2022, 8, 11),160, 9));
        list.add(new Meat("10", "seafood", LocalDate.of(2022, 8, 17),170, 12));
        Scanner sc= new Scanner(System.in);
        for (Material o:list
             ) {
            System.out.println(o.getRealMoney());
        }
        ManagerMaterial managerMaterial= new ManagerMaterial();
        int pos=0;
        while(true){
            System.out.println("Management material System:");
            System.out.println("Enter 1:To Insert Material");
            System.out.println("Enter 2:To Update Material");
            System.out.println("Enter 3:To Delete Material");
            System.out.println("Enter 4:To Display product");
            System.out.println("Enter 5:To exit:");
            String line = sc.nextLine();
            switch (line){
                case "1":{
                    System.out.println("Enter a: To insert CrispyFlour");
                    System.out.println("Enter b: to insert Meat");
                    String type=sc.nextLine();
                    switch (type) {
                        case "a":{
                            managerMaterial.addFlourMaterial(list);
                            break;
                    }
                        case "b": {
                            managerMaterial.addMeatMaterial(list);
                            break;
                        }
                        default:
                            System.out.println("Invalid. Please return enter!");
                    }
                    break;
                }
                case "2":{
                    System.out.println("Enter position object to update:");
                    pos= Integer.parseInt(sc.nextLine());
                    managerMaterial.updateMaterial(list,pos);
                    break;
                }

                case "3": {
                    System.out.println("Enter position object to remove:");
                    pos= Integer.parseInt(sc.nextLine());
                  managerMaterial.deleteMaterial(list,pos);
                    break;
                }
                case "4":{
                    managerMaterial.showListMaterial(list);
                    break;

                }
            }
        }

    }
}
