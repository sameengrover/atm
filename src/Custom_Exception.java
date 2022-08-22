import java.text.ParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "This is toString method";
    }

    @Override
    public String getMessage() {
        return "This is getMessage";
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = 13;
        try{
            String entered = sc.next();
            a = Integer.parseInt(entered);
        }
        catch (InputMismatchException e){
            System.out.println("Saale int hi daal, le ab mai 13 kar rha hu ");
        }catch (NumberFormatException e){

        }
        finally{
            System.out.println("Finally a ki value nikli hai "+ a);
        }
        try {


            if (a < 9) System.out.println("Tha value is betwwen 0 to 9");

            try {
                if (a > 9 && a < 80){
                    int[] arr = new int[5];
                    int b = 0;
                    arr[8] = 4/b;
            }}catch ( ArrayIndexOutOfBoundsException | ArithmeticException e) {
                System.out.println(e.getMessage());
//                System.out.println(e);
            }
//            catch (Exception e) {
//                System.out.println(e + "This is above 90");
//            } catch (Exception e) {
//                System.out.println("This is above 80");
//            }
        } finally {
            System.out.println("Beda gark hogya");
        }
    }
}

