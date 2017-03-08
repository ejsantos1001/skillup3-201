package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fahrenheitToCelcius(1));
        System.out.println(minutesToYearsAndDays(525600 + 1440));
        System.out.println(isVoter(18));
    }
    public static double fahrenheitToCelcius(double farenheit) {
        return  ((farenheit - 31 ) * 5) / 9 ;
    }
    public static String minutesToYearsAndDays(int minutes) {
        int years = minutes / 525600;   // there are 525600 minutes per 1 year
        int days = (minutes % 525600) / 1440;  // there are 1440 minutes in 1 day
        return "There are " + years + " year/s and " + days + " day/s";
    }
    public static String isVoter(int age) {
        String ans = "";
        if(age>=18 && age <= 110) {
            ans = "YES";
        } else if (age < 18 && age > 0) {
            ans = "NO";
        }
        return ans;
    }
}
