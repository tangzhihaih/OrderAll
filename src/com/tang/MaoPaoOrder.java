package com.tang;

/**
 * Created by Administrator on 2018/11/24.
 */
public class MaoPaoOrder {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,32,67,44,65,22};
        new MaoPaoOrder().MaoPao(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("________"+arr[i]);
        }
    }
    public void MaoPao(int arr[]){
        for(int j=0;j<arr.length-1;j++) {
            for (int i = 0; i < arr.length - j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
