package com.udemy;

import java.net.InetAddress;

public class CoreJavaBrushUp {
    public static void main(String[] args) {
        int num = 5;
        String str = "pravin";
        char ch = 'c';
        double d = 12.50;
        boolean b= true;
        System.out.println(str);

        //Arrays-
        int[] arr = new int[5];
        arr[0] =5;
        arr[1] =6;
        arr[2] =7;
        arr[3] =8;
        arr[4] =9;

        System.out.println(arr[2]);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

        String[] name = {"pravin", "akshat","naveen", "maa"};
        for (int i=0; i<name.length;i++){
            System.out.println(name[i]);
        }

        for (String s : name){
            System.out.println(s);
        }

    }
}
