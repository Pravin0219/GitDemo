package com.udemy;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {

        int[] arr = {1,2,4,6,8,3,5,10,16,20,21};
        for (int i=0; i<arr.length;i++){
            if (arr[i] % 2==0){
                System.out.println(arr[i]);
            }
            else
            {
                System.out.println(arr[i]+ " There is no even number in given array");
            }
        }
    }
}
