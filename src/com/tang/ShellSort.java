package com.tang;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/11/23.
 */

public class ShellSort {
    /* public static  void shellSort(int[] array, int len) {
         int d = len;
         while (d > 1) {
             d = (d + 1) / 2;
             for (int i = 0; i < len - d; i++) {
                 if (array[i + d]<array[i]) {
                     int temp = array[i + d];
                     array[i + d] = array[i];
                     array[i] = temp;
                 }
             }
         }
     }*/
    public void shellSort(int[] arr, int len) {
        int d = len;
        while (d > 1) {
            d = (d + 1) / 2;
            for (int i = 0; i < len - d; i++) {
                if (arr[i + d] < arr[i]) {
                    int temp = arr[d + i];
                    arr[d + i] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = {23, 25, 12, 42, 35};
        int d = testArray.length;
        new ShellSort().shellSort(testArray, d);
        System.out.println("The result is:");
        for (int item : testArray) {
            System.out.print(item);
            System.out.print(' ');
        }
        StringBuffer stringBuffer = new StringBuffer("ABCDE");
        System.out.println("______________"+stringBuffer);
        int dd=stringBuffer.capacity();
        System.out.println("________"+dd);
        System.out.println("___"+stringBuffer.length());
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("vf");
        arrayList.add("xvblzxvblk");
        arrayList.add(1,"nihao");
        System.out.println("____"+arrayList);
        int size=arrayList.size();
        System.out.println("________"+size);
        /*arrayList.remove(1);*/
        arrayList.remove("nihao");
        System.out.println("__________"+arrayList);
    }
}
