import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//import java.io.PrintStream;
//import java.util.Scanner;
//import java.io.PrintStream;
//
//public class practiceSet {
//    //-------Sum of 3 even number----------
////public static void main(String[] args) {
////
////    int i, n = 3;
////    int sum = 0;
////    for(i=0;i<n;i++)
////
////    {
////        sum = sum + (2 * i);
////    }
////    System.out.println(sum);
////}
////    --------FInd Multiplication of n  numbers-------
//    public static void main(String[] args) {
////    System.out.println("Enter n numbers");
////    Scanner sc = new Scanner(System.in);
////    int n = sc.nextInt();
////    int i, mul=1;
////    for(i=0; i<n; i++){
////        mul = mul*(i);
////    }
////    System.out.println("Multiplication is :"+ mul);
////    ______For find the table of n number-----
//
////    int i;
////    System.out.println("Enter value of n");
////    Scanner sc = new Scanner(System.in) ;
////    int n= sc.nextInt();
////    for(i=1; i<=10; i++){
////        System.out.printf("%d X %d = %d\n", n, i, n * i);
////    ------------ To found factorial--------
////    int i,n=5;
////    int fact = 1;
////    for(i=1; i<=5;i++){
////        fact = fact*i;
////    }
////    System.out.println(fact);
//// -------FOUND FACTORIAL using while loop--------
////    int i=1;
////    System.out.println("enter value n");
////    Scanner sc = new Scanner(System.in);
////    int n = sc.nextInt();
////    int fact =1;
////    do{
////        fact *= i;
////        i++;
////
////    }while(i<=n);
////    System.out.println(fact);
////    --------Print * in decrement form---------
////      int i;
////      for (i =4; i>0;i--){
////          for (int j=0;j<i;j++){
////              System.out.print("*");
////          }
////          System.out.println("");
////      }
//}
//--- to find largest number---------
//class practiceSet{
//    public static void main(String[] args) {
//        int [] arr = {4,5,3,2,7,6,8};
//        int max = arr[0];
//        for(int i =1;i<arr.length;i++){
//            if(arr[i]>max){
//                max =arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//    }
class practiceSet{

   static void swap(){
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b= sc.nextInt();
        temp =a;
        a =b;
        b= temp;
       System.out.println("Values after swapping: " +a +"," +b);
    }
    public static void main(String[] args) {
       swap();
    }
}
