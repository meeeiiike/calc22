package ie.atu;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        add();

    }
    public static void add()
    {
        System.out.println("please enter first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("please enter second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("the total is: " + total);
    }
}
