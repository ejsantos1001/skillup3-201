package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);


        System.out.println("input letter of your choice a)fahrenheitToCelcius  b)minutesToYearsAndDays c)isVoter :");
        String ans = scanner.next();
        chooseProgram(ans);


    }
    public static void chooseProgram(String choice) {
        Scanner scanner2 = new Scanner(System.in);
        switch(choice) {
            case "a" :
                System.out.println("please enter a fahrentheit value:");
                double input =  scanner2.nextDouble();
                System.out.println(fahrenheitToCelcius(input));
                break;
            case "b" :
                System.out.println("enter a certain amount of minutes:");
                int input2 = scanner2.nextInt();
                System.out.println(minutesToYearsAndDays(input2));
                break;
            case "c" :
                System.out.println("enter your age");
                int input3 = scanner2.nextInt();
                System.out.println(isVoter(input3));
        }

    }

    public static double fahrenheitToCelcius(double farenheit) {
        return  ((farenheit - 31 ) * 5) / 9 ;
    }
    public static String minutesToYearsAndDays(int minutes) {
        int years = minutes / 525600;   // there are 525600 minutes per 1 year
        int days = (minutes % 525600) / 1440;  // there are 1440 minutes in 1 day
        return "There are " + years + " year/s and " + days + " day/s in " + minutes + " minute/s";
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
