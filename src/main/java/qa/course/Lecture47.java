package qa.course;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lecture47 {
    public static int findBiggestNumber(int a, int b, int c) {
        //find the biggest of tree numbers


     /*   if (a >= b) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }

        } else {
            if (b >= c) {
                return b;
            } else {
                return c;
            }

      */
        return Math.max(a, Math.max(b, c));

    }

    public static double calcTrianglePlotHeron(double a, double b, double c) {
        //Calculates plot of triangle using Heron's formulae
        if (a + b <= c || c + a <= b || b + c <= a) {
            System.out.printf("%.2f,%.2f,%.2f do not form a triangle.%n", a, b, c);
            return 0;
        }
        double p;
        p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static int[] randomNumbersArray(int arrayLength) {
        //generates array with random numbers
        int[] arrayNumbers = new int[arrayLength];
        Random rnd = new Random();
        for(int i=0; i<arrayLength;i++) arrayNumbers[i] = rnd.nextInt(100);
        return arrayNumbers;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String anyKey = "Press any key to continue!";

        System.out.println("Compare tree numbers and print the biggest one!");
        System.out.println("Input the first number");
        int a = scn.nextInt();
        System.out.println("Input the second number");
        int b = scn.nextInt();
        System.out.println("Input the third number");
        int c = scn.nextInt();
        System.out.printf("The biggest number is %d!%n", findBiggestNumber(a, b, c));
        System.out.printf("%s%n", anyKey);
        scn.nextLine();
        scn.nextLine();

        System.out.println("Calculate plot of a triangle!");
        System.out.println("Input side a");
        double sa = scn.nextDouble();
        System.out.println("Input side b");
        double sb = scn.nextDouble();
        System.out.println("Input side c");
        double sc = scn.nextDouble();
        double plotArea = calcTrianglePlotHeron(sa, sb, sc);
        if (plotArea > 0)
            System.out.printf("Plot area of a triangle is %.2f.%n", plotArea);
        System.out.printf("%s%n", anyKey);
        scn.nextLine();
        scn.nextLine();

        System.out.println("Generate array with numbers");
        System.out.println("Input array length");
        int arrayLength = scn.nextInt();
        if (arrayLength <= 0)

            System.out.printf("Incorrect length of array %d.%n", arrayLength);
        else {
            int[] arr = randomNumbersArray(arrayLength);
            System.out.printf("Array is %s.%n", Arrays.toString(arr) );

            }

        }
    }
