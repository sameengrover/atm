////import java.util.Scanner;
////
////class AssertClass {
////    public static void main(String args[]){
////        AssertClass q = new AssertClass();
////        q.studentMethod();
////    }
////    void print(AssertClass object){
////        System.out.println("Well Done!");
////    }
////    void studentMethod(){
////        AssertClass q = new AssertClass();
////        q.print(q);
////    }
////}
//
//class AssertClass{
//    public static void main(String[] args) {
//        int[][][] arr = new int[3][4][5];
//        for(int i=0;i<3;i++){
//            for(int j=0; j<4;j++){
//                for(int k=0;k<5;k++){
//                    arr[i][j][k]=i*j*k;
//                }
//            }
//        }
//        for(int i=0;i<3;i++){
//            for(int j=0; j<4; j++){
//                for(int k=0; k<5;k++){
//                    System.out.println(arr[i][j][k]+" ");
//                    System.out.println();
//                }
//                System.out.println();
//            }
//        }
//    }
//}
class AssertClass {
//    static void pattern(int N) {
//        for (int i = 0; i < N; i++) {
//            for (int j = 2 * (N - i); j > -0; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.printf("* ");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern(5);
//    }
//}
//----------- Triangle Pattern-----------
//    static void triangle(int n){
//        for(int i=0; i<n;i++){
//            for(int j=n-i; j>1;j--){
//                System.out.print(" ");
//            }
//            for(int j=0; j<=i; j++){
//                System.out.printf("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        triangle(5);
//    }
//    -------- Print Countings----------
//public static void main(String[] args) {
//    int row =6;
//    for(int i=1; i<=row; i++){
//        for(int j=1; j<i; j++){
//            System.out.print(" ");
//        }
//        for (int j=i ; j<=row; j++){
//            System.out.printf(j +" ");
//        }
//        System.out.println();
//    }
//}
public static void main(String[] args) {
    int rows =7;
    for(int i =1; i<=rows; i++){
        for(int j=1; j<i; j++){
            System.out.print(" ");
        }
        for(int j=i; j<=rows;j++){
            System.out.printf(j+" ");
        }
        System.out.println("");
    }
    for(int i= rows -1; i>=1; i--){
        for(int j=1; j<i; j++){
            System.out.print(" ");
        }
        for(int j=i; j<=rows;j++){
            System.out.printf(j+ " ");
        }
        System.out.println("");
    }
}
}

