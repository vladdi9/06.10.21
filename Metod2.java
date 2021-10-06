package org.itstep;

public class Metod2 {
    public static void main(String[] args) {
        //isDisarium(135) ➞= true:  1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
        System.out.println(isDisarium(135));
        for (int i=2; i<=1000000000; i++)
            if (isDisarium(i)) System.out.println(i);
    }

    static boolean isDisarium (int number){
        int count = (int) Math.floor(Math.log10(number)+1);
        int num = number, sum=0;
        while (num!=0){
            int digit = num%10;
            num/=10;
            sum+=Math.pow(digit,count--);
        }
        return number==sum?true:false;
    }
}
