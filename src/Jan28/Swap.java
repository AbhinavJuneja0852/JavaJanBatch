package Jan28;

public class Swap {
    public static void main(String[] args){

        int x =10;
        int y =20;
        int z ;

        System.out.println("Values Before Swapping");
        System.out.println(" X : " + x);
        System.out.println(" Y : " +y);

        z=x;
        x=y;
        y=z;

        System.out.println();
        System.out.println("Values After Swapping");
        System.out.println(" X : " + x);
        System.out.println(" Y : " +y);


    }
}
