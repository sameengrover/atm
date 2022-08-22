import java.util.Scanner;

class NegativeException extends Exception{
    @Override
    public String toString() {
        return "This is the String value";
    }

    @Override
    public String getMessage() {
        return "Area can't be negative";
    }
}

public class ThrowsKeyword {
    public static double area(int r) throws NegativeException {
        if (r < 0) {
            throw new NegativeException();
        }
        double c = Math.PI * r * r;
        return c;
    }

    public static void main(String[] args) {
        try{
            area(-5);
        } catch(NegativeException e){
            System.out.println(e);
        }
    }
}


