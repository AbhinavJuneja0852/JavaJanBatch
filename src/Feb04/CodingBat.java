package Feb04;

public class CodingBat {
    public static boolean main(String[] args) {
        int temp1=0;
        int temp2=0;

        if((temp1<0 && temp2>100) || (temp1>100 && temp2<0)){
            return true;
        } else return false;

    }

}
/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */