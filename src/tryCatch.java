//import java.util.Scanner;
//
//class TryCatch {
//    public static void main(String[] args) {
//        int [] marks = {11,33,55,66};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Index Value");
//        int ind = sc.nextInt();
//
//        System.out.println("Enter the number with you want to divide");
//        int number = sc.nextInt();
//        try{
//            System.out.println("The index value is: " +marks[ind]);
//            System.out.println("The number is: " +marks[ind]/number);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Cross check your Index Number");
//            System.out.println(e);
//        }
//        catch(ArithmeticException d){
//            System.out.println("Some Arithmetic Error");
//            System.out.println(d);
//        }
//
//    }
//}