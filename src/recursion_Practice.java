//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class recursion_Practice {
////----------- Using Recursion------------
//    public static BigInteger fact(int n){
//        if(n == 0 || n==1){
//            return BigInteger.valueOf(1);
//        }else {
//            BigInteger nMinusOne = BigInteger.valueOf(n-1);
//            BigInteger myN = BigInteger.valueOf(n);
//            return myN.multiply(nMinusOne, true);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println("The factorial of this number is : " + fact(n));
//    }
//}
////