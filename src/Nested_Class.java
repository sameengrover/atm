import java.util.Scanner;

public class Nested_Class {
    public static void main(String[] args) {
        int[] marks = {22, 44, 55, 34};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            try {

                System.out.println("Enter the valid Index Number: ");
                int ind = sc.nextInt();
                System.out.println("************Welcome to era of array**********");
                try {
                    System.out.println("The value of index is: " + marks[ind]);
                    System.out.println("your index number is valid");
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Cross Check your index value");
                    System.out.println("Some Arithmetic Error");
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
