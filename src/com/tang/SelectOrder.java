package com.tang;

/**
 * Created by Administrator on 2018/11/24.
 */
public class SelectOrder {
    public static void main(String[] args) {
        Integer[] arr={5,2,3,41,3};
        new SelectOrder().Select(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("_________"+arr[i]);
        }

    }
    public void Select(Integer[] arr){
        int min;
        for (int i = 0; i <arr.length-1 ; i++) {
            min=arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                if (min>arr[j]){
                    int temp=arr[j];
                    arr[j]=min;
                    min=temp;
                }
                if (j==arr.length-1){
                    arr[i]=min;

                }

            }


        }
    }
}
