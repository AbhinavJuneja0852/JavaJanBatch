package Jan31;

import java.util.Scanner;

public class ScanUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value of a");
        int a=sc.nextInt();
        System.out.println("Please enter value of b");
        int b=sc.nextInt();

        if(a==b){
            System.out.println("a and b are same.");
        }
        else {
            System.out.println("a and b are not same.");
        }

    }
}
