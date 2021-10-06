package org.itstep;

import java.util.Arrays;

public class DZ41 {
    //Определить пропущенные числа в массиве, элементы которого не повторяются
    public static void main(String[] args) {
        int[] a = {4,1,3,7,6,9};
        //Найти мин. и макс. элементы
        int min = a[0];
        for (int i=1; i<a.length; i++)
            if (min>a[i]) min=a[i];
        //System.out.println(min);
        int max = 0;
        for (int i=1; i<a.length; i++)
            if (max<a[i]) max=a[i];
        //Поиск каждого элемента
        for (int i=min; i<=max; i++) {
            int index = -1;
            for (int j=0; j<a.length; j++)
                if (a[j]==i) index = j;
            if (index == -1) System.out.println(i);
        }
        //Сортировка
        Arrays.sort(a);   // Сортировка масива
        System.out.println(Arrays.toString(a));
        for (int i=a[0]; i<=a[a.length-1]; i++) {
            int index = Arrays.binarySearch(a, i);
            if (index<0) System.out.println(i);
        }
    }
}
