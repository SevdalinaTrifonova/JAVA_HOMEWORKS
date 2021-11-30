package qa.course;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Lecture42 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Task 1
        System.out.println("Array of 20 elements and average of its elements");
        int[] arr =  arrayMultiply5(20);

        //Task 2, Decision 1
        double lAvg = Arrays.stream(arr).average().orElse(Double.NaN);
        System.out.printf("Average of array values is %.2f%n", lAvg);
        System.out.println("/*End of tasks  1 and 2 */\n");

        //Array of N elements
        System.out.println("Input a number N:");
        int elN = scn.nextInt();
        if (elN>0) {
            //Tasks 4
            //Array of N elements
            createArray(elN);

            //Task 5
            //List of numbers can't be divided by 3 and 7
            notDiv3and7(elN);

            //Task 6
            //Fibonacci numbers list
            listFibonacci(elN);
        }
        else
            System.out.println("Incorrect number N");
        System.out.println("/*End of tasks 4,5 and 6 */\n");
        System.out.println("Array of elements, sum of odd and even numbers in array");
        System.out.println("Input count of elements:");
        int elM = scn.nextInt();
        if (elM > 0) {
            int[] arrM = new int[elM];
            int sumOdd = 0;
            int sumEven = 0;
            for (int i = 0; i < arrM.length; i++) {
                System.out.printf("Input element [%d]:", i + 1);
                arrM[i] = scn.nextInt();
                if (arrM[i] % 2 == 0)
                    sumEven += arrM[i];
                else
                    sumOdd += arrM[i];
            }
            System.out.printf("The array is %s.%n", Arrays.toString(arrM));
            System.out.printf("The sum of odd numbers is %d. The sum of even numbers is %d.%n", sumOdd, sumEven);
            System.out.printf("The average of all numbers in the array is %.2f%n", calcAverage(arrM));
        } else
            System.out.println("Incorrect number of array elements.%n");
    }


    public static int @NotNull [] arrayMultiply5(int n) {
        int[] lArr = new int[n];
        for (int i = 0; i < n; i++) {
            lArr[i] = (i + 1) * 5;
        }
        System.out.printf("Array of %d elements is %s%n", 20, Arrays.toString(lArr));
        return lArr;
    }

    public static double calcAverage(int @NotNull [] arrInt) {
        double calcAverage = 0;
        for (int el : arrInt)
            calcAverage += el;
        calcAverage /= arrInt.length;
        return calcAverage;
    }

    public static void createArray(int n){
        int[] lArray = new int[n];
        for (int i = 0; i<n; i++) {
            lArray[i] = i;
        }
        System.out.printf("Array of %d elements is %s%n", n, Arrays.toString(lArray));
    }

    public static void notDiv3and7(int n){
        LinkedList<Integer> listDiv = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0)
                listDiv.add(i);
        }
        System.out.printf("The numbers in array that can't be divided by 3 and 7 are %s%n", listDiv);
    }

    private static void listFibonacci(int n) {
        int[] arrFibonacci = new int[n];
        int i=0;
        while (i<n){
            if (i < 2)
                arrFibonacci[i] = i;
            else
                arrFibonacci[i] = arrFibonacci[i - 1] + arrFibonacci[i - 2];
            i++;
        }
        System.out.printf("The Fibonacci Numbers are %s and the sum of all numbers is %d%n", Arrays.toString(arrFibonacci), Arrays.stream(arrFibonacci).sum());
    }
}
