package com.company.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.SimpleFormatter;


public class Meat extends Material{
    private double weight;
    public Meat(){}


    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public double getRealMoney(){
        LocalDate time = LocalDate.now();
        int dayOfMonthNow= time.getDayOfMonth();
        int monthOfYear= time.getMonthValue();
        int yearNow= time.getYear();
        int manufactureDateTime = getExpiryDate().getDayOfMonth();
        int manufactureMonthTime = getExpiryDate().getMonthValue();
        int manufactureYearTime= getExpiryDate().getYear();

        int dif=0;
        if(manufactureYearTime> yearNow){
            dif =manufactureDateTime -dayOfMonthNow +30;
        }else if (manufactureMonthTime> monthOfYear){
            dif =  manufactureDateTime-dayOfMonthNow +30;
        }else {
            dif= manufactureDateTime-dayOfMonthNow;
        }
        double realPrice=0;
        double price=0;
if (dif<=5){
    price= getAmount()*0.3;
   realPrice= getAmount()-price;
   return realPrice;
}else{
    price=getAmount()*0.1;
    realPrice=getAmount()-price;
    return realPrice;
}
    }

    @Override
    public double getAmount() {
        double amount =  (weight*getCost());
        return amount;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate date=getManufacturingDate().plusDays(7);
        return date;
    }
    @Override
    public String toString(){
        return super.toString()+
                "weight"+getWeight();
    }
}
