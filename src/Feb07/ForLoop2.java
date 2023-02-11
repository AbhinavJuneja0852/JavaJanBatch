package Feb07;

public class ForLoop2 {
    public static void main(String[] args) {
        System.out.println("Starting Loop");

        for (int i = 1; i<=5 ; i++){
            for (int j = i; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Ending Loop");
    }
}
