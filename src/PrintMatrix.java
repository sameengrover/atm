import java.util.Scanner;

class PrintMatrix{
    public static void main(String[] args) {
        int [][] arrayName =new int [2][2];
                Scanner sc = new Scanner(System.in);
                for(int i = 0; i<2; i++) {
                    for (int j = 0; j < 2; j++) {
                        arrayName[i][j] = sc.nextInt();
                        System.out.println(arrayName);
                    }

                }
                    System.out.print(arrayName);
    }
}