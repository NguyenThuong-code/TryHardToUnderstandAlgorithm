package com.company.Numbers;

import java.text.DecimalFormat;

public class numberToWord2 {
    private static final String[] twodigits={"", "Ten","Eleven", "Twelve", "Thirteen", "Fourteen","Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] onedigit={"", "One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
private numberToWord2(){
}
private static String convertUpToThousand(int number){
    String sofar;
        if(number%100<20){
            sofar = onedigit[number%100];
            number= number/100;
        }else {
            sofar= onedigit[number%10];
            number=number/10;
            sofar= twodigits[number%10]+sofar;
            number=number/10;
        }if (number==0)
            return sofar;
        return onedigit[number]+"Hundred"+sofar;
    }
    public static String convertNumberToWord(long number){
    if (number==0){
        return "zero";
    }
    String num= Long.toString(number);
    String pattern="000000000000";
        DecimalFormat decimalFormat= new DecimalFormat(pattern);
        num= decimalFormat.format(number);
        int billions = Integer.parseInt(num.substring(0,3));
        int millions =Integer.parseInt(num.substring(3,6));
        int hundredThousands= Integer.parseInt(num.substring(6,9));
        int thousands= Integer.parseInt(num.substring(9,12));
        String tradBillions;
        switch (billions){
            case 0:
                tradBillions="";
                break;
            case 1:
                tradBillions=convertUpToThousand(billions)+"Billion";
                break;
            default:
                tradBillions= convertUpToThousand(billions)+"Billion";
        }
        String result = tradBillions;
        String tradMillons;
        switch (millions){
            case 0:
                tradMillons="";
                break;
            case 1:
                tradMillons = convertUpToThousand(millions)+"Millon";
                break;
            default:
                tradMillons= convertUpToThousand(millions)+"Million";
        }
        result= result+tradMillons;
        String traHundredThousand;
        switch (hundredThousands){
            case 0:
                traHundredThousand ="";
                break;
            case 1:
                traHundredThousand= "One Thousand";
                break;
            default:
                traHundredThousand=convertUpToThousand(hundredThousands)+ "Thousand";
        }
        result = result+traHundredThousand;
        String tradThousand;
        tradThousand= convertUpToThousand(thousands);
        result= result+tradThousand;
        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }

    public static void main(String[] args) {
        System.out.println(convertNumberToWord(1101));
    }
}



