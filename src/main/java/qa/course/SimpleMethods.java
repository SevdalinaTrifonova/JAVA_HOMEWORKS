package qa.course;

import java.util.Scanner;

public class SimpleMethods {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Input password");
        String pwd = scn.nextLine();
        if (isValidPassword(pwd))
            System.out.println("Valid Password Format");
        else

            System.out.println("Invalid Password Format");

        System.out.println("Input tree numbers");
        System.out.println("Number 1:");
        double a = scn.nextDouble();
        System.out.println("Number 2:");
        double b = scn.nextDouble();
        System.out.println("Number 3:");
        double c = scn.nextDouble();
        if (areEqual(a, b, c))
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are NOT equal");
        if (arePositive(a, b, c))
            System.out.println("Numbers are positive");
        else
            System.out.println("Numbers are NOT positive");

        double result = sum(average(a, b),
                average(b, c));
        System.out.printf("The sum of average of sum(%.2f; %.2f) and  sum(%.2f; %.2f) is %.2f", a, b, b, c, result);
    }

    public static boolean isValidPassword(String sPassword) {
        return sPassword.matches("^(?=.{8,})(?=.*[a-zA-Z])(?=.*[@#$%^&+=])(?=.*[0-9]).*$");

    }

    public static boolean areEqual(double a, double b, double c) {
        return (a == b && b == c);
    }

    public static boolean arePositive(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0);
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

}


