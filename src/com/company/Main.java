package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fahrenheitToCelcius(1));
    }
    public static double fahrenheitToCelcius(double farenheit) {
        return  ((farenheit - 31 ) * 5) / 9 ;
    }
}
