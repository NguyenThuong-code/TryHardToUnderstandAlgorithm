package com.company.test1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CrispyFlour extends  Material {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRealMoney() {
        LocalDate time = LocalDate.now();

        int monthOfYear = time.getMonthValue();
        int yearNow = time.getYear();

        int manufactureMonthTime = getExpiryDate().getMonthValue();
        int manufactureYearTime = getExpiryDate().getYear();

        int dif = 0;
        if (manufactureYearTime > yearNow) {
            dif =manufactureMonthTime - monthOfYear+12 ;
        } else {
            dif =manufactureMonthTime - monthOfYear;
        }
        double realPrice=0;
        double price=0;
        if (dif <=2) {
           price= getAmount() * 0.4;
           realPrice= getAmount()-price;
           return realPrice;
        } else if (dif <=4){
            price=getAmount() * 0.2;
            realPrice= getAmount()-price;
            return realPrice;
        }else {
            price=getAmount()*0.05;
            realPrice= getAmount()-price;
            return realPrice;
        }
    }

    @Override
    public double getAmount() {
        double amount = quantity * getCost();
        return amount;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate date = getManufacturingDate().plusYears(1);
        return date;
    }

    @Override
    public String toString() {
        return super.toString() +
                "quantity" + getQuantity();
    }
}
