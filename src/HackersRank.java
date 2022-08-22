import java.util.Scanner;

//import java.math.BigInteger;
//
//public class HackersRank {
//   public static BigInteger fact(int n){
//       if(n==0||n==1){
//           return BigInteger.valueOf(1);
//       }
//       else {
//           BigInteger nMinusOne = BigInteger.valueOf(n - 1);
//           BigInteger myN = BigInteger.valueOf(n);
//           return myN.multiply(nMinusOne, true);
//
//       }
//   }
//
//    public static void main(String[] args) {
//        System.out.println("Fact of n: "+fact(5));
//    }
//
//}
public class HackersRank{

    private static String isEven(int num){
        if((num & 1) == 0) return "Even";
        else return "Odd";
    }

    public static void main(String[] args) {

        int n =20;

//
        for(int i=0; i<=n; i++){
            System.out.println(i + " is: "+ isEven(i));
        }
    }
}

class SameenRank{


    static void printKrde(int n){
        if(n==0) return;
        System.out.println(n);
        n--;
        printKrde(n) ;
    }


    public static void main(String[] args) {
        printKrde(5);
    }
}