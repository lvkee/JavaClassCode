package cn.edu.zucc.cs;
//: exp4:MyMath.java
// int max(int[] ar) to Find the max
// double max(int[] ar) to Find the max
// int min(int[] ar) to Find the min
// double min(int[] ar) to Find the min
// void sort(double[] ar) to sort
import java.util.*;
public class MyMath {
    public MyMath() {}
    public static int max(int[] ar) {
        int i = 0;
        int max = ar[i];
        for (; i < ar.length; i++){
            if (ar[i] > max)
                max = ar[i];
        }
        return max;
    }

    public static double max(double[] ar) {
        int i = 0;
        double max = ar[i];
        for (; i < ar.length; i++){
            if (ar[i] > max)
                max = ar[i];
        }
        return max;
    }
    public static int min(int[] ar) {
        int i = 0;
        int min = ar[i];
        for (; i < ar.length; i++){
            if (ar[i] < min)
                min = ar[i];
        }
        return min;
    }

    public static double min(double[] ar) {
        int i = 0;
        double min = ar[i];
        for (; i < ar.length; i++){
            if (ar[i] < min)
                min = ar[i];
        }
        return min;
    }

    public static void sort(double[] ar) {
        int i = 0;
        int j = 0;
        double temp = 0;
        for ( ; i < ar.length; i++) {
            for (j = i; j < ar.length; j++){
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}
