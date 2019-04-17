package com.tang;

/**
 * Created by Administrator on 2018/11/22.
 */
public class HurrryOrder {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        InsertSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("++"+arr[i]);

        }
    }
    public static int[] InsertSort(int[] arr){
        int target;
        int j;
        for (int i = 1; i < arr.length ; i++) {
            j=i;
            target=arr[i];

            while(j>0&&target<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=target;
        }
        return arr;
    }
}
