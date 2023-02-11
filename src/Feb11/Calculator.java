package Feb11;

import java.util.Scanner;

public class Calculator {

    public static void addition(int num1,int num2){
        System.out.println("The answer is "+ (num1+num2));
    }
    public static void subtraction(int num1,int num2){
        System.out.println("The answer is "+ (num1-num2));
    }
    public static void multiplication(int num1,int num2){
        System.out.println("The answer is "+ (num1*num2));
    }
    public static void division(int num1,int num2){
        System.out.println("The answer is "+ (num1/num2));
    }
    public static void modulus(int num1,int num2){
        System.out.println("The answer is "+ (num1%num2));
    }
    public static void exit(int num1,int num2){
        System.out.println("You are exited");
    }
    public static void main(String[] args) {

        int choice;

        do {System.out.println("Welcome");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.println("**********");
        System.out.println("Please enter your choice from 1-6");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("Enter First Number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();


         switch (input) {
                case 1:
                    addition(num1, num2);
                    break;

                case 2:
                    subtraction(num1, num2);
                    break;

                case 3:
                    multiplication(num1, num2);
                    break;

                case 4:
                    division(num1, num2);
                    break;

                case 5:
                    modulus(num1, num2);
                    break;

                case 6:
                    break;
                default:
                    System.err.println("Invalid Input");
            }
            System.out.println("Do you want to continue? Press 1 for Yes and 2 for No.");
            choice = sc.nextInt();
        } while (choice == 1);
    }
}
