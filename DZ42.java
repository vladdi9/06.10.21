package org.itstep;

public class DZ42 {
    public static void main(String[] args) {
        int count = 5; //количество строк
        for (int i=1; i<=count; i++) {
            for (int j=0; j<=(count-i)*2; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
                for (int j = i-1; j >= 1; j--)
                System.out.print(j+ " ");
            System.out.println();
        }
    }
}
