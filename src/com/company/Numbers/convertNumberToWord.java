package com.company.Numbers;

public class convertNumberToWord {
    static void numberToword(char num[]){
        int len = num.length;
        if (len==0){
            System.out.println("The string is empty");
            return;
        }
        if (len>4){
            System.out.println("The given number has more than 4 digits");
            return;
        }
        String[] onedigit= new String[]{"zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twodigit= new String[]{ "","Ten","Eleven", "Twelve", "Thirteen", "Fourteen","Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multipleoften = new String[]{"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] poweroftent=new String[]{"Hundred", "Thousand"};
        System.out.print(String.valueOf(num)+ ":");
        if (len==1){
            System.out.println(onedigit[num[0]-'0']);
            return;
        }
        int x=0;
        while (x<num.length){
            if(len>=3){
                if (num[x]-'0'!=0){
                    System.out.print(onedigit[num[x]-'0']+" ");
                    System.out.print(poweroftent[len-3]+" ");
                }
                --len;
            }else {
                if(num[x]-'0'==1){
                  int sum=num[x]-'0'+num[x+1]-'0';
                    System.out.println(twodigit[sum]);
                    return;
                }else if (num[x]-'0'==2&& num[x+1]-'0'==0){
                    System.out.println("Twenty");
                    return;
                }else {
                    int i =(num[x]-'0');
                    if (i>0)
                        System.out.print(multipleoften[i]+" ");
                    else System.out.print("");
                    ++x;
                    if(num[x]-'0'!=0)
                        System.out.println(onedigit[num[x]-'0']);
                }
            }
            ++x;
        }
    }

    public static void main(String[] args) {
        numberToword("111".toCharArray());
        numberToword("673".toCharArray());
    }
}
