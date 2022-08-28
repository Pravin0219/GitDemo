package com.udemy;

public class CoreJavaBrushUp3 {
    public static void main(String[] args) {

        String s1 = "pravin singh akshat";
        String s2 = "pravin singh akshat";

        String s3 = new String("pravin");
        String s4 = new String("singh");
        String s5 = new String("akshat");

        String[] splitedStr = s1.split(" ");
        System.out.println(splitedStr[0]);
        System.out.println(splitedStr[1]);
        System.out.println(splitedStr[2]);
    }
}
