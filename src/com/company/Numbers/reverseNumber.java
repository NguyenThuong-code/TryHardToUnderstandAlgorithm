package com.company.Numbers;

import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class reverseNumber {
    public static void sumReverse(int n, int mul){
        int i=1;
        int rever=0;
        while(i<=n){
            int temp=mul%10;
            rever=rever*10+temp;
            mul = mul/10;
            i++;
        }
        System.out.println(rever);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = sc.nextInt();
        int mul= number;
        int n=0;
        while(number!=0){
           number= number/10;
           n=n+1;
        }
        sumReverse(n,mul);

      }
    }

