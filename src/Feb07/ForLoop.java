package Feb07;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the starting number");
        int startingNo= sc.nextInt();
        System.out.println("Please Enter the ending number");
        int endingNo=sc.nextInt();
        System.out.println("Please enter 1 for Even number or 2 for Odd number.");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                for (int i=startingNo;i<endingNo;i++){
                    if (i%2==0){
                        System.out.println(i);
                    }
            }break;
            case 2:
                for (int i=startingNo; i<endingNo ;i++){
                    if (i%2!=0){
                        System.out.println(i);
                    }
                }break;
            default:
                System.out.println("Invalid Input");

        }



    }
}
