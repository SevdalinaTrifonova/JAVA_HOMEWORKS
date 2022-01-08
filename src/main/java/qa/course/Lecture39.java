package qa.course;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Lecture39
// Console input-output of name and hobby

{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input your name:");
        String name = scn.nextLine();
        System.out.println("Please write your hobby:");
        String hobby = scn.nextLine();
        System.out.println("You are " + name + " and your hobby is " + hobby);
    }

}

