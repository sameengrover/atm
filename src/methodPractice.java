public class methodPractice {
//     int logic(int x, int y) {
//        int z;
//        if (x > y) {
//            z = (x + y) * 5;
//        } else {
//            z = x + y;
//        }
//        return z;
//    }
//-------------------Calling through object--------
//    public static void main(String[] args) {
//        int a = 50;
//        int b = 70;
//        int c;
//        methodPractice obj = new methodPractice();
//        c = obj.logic(a,b);
//        int a1 = 34;
//        int b1= 23;
//        int c1;
//        c1 = obj.logic(a1,b1);
//        System.out.println(c);
//        System.out.println("The value of a1+b1 is: "+ c1);
//-----------------------------------------------------------
//-------- Using Char Arguments--------------
//    public static void sameen(int x, int y) {
//        if (x > 10 || y<20) {
//            System.out.println("May i come in sir");
//        } else System.out.println(" get out from the room");
//
//    }
//
//    public static void main(String[] args) {
//        int a,b;
//       sameen(9,87);
//
//    }
//    ---------------------------------------------------

//    --------Changing value using array----------------
//    static void value(int[] arr) {
//        arr[0] = 98;
//    }
//
//    public static void main(String[] args) {
//        int [] marks = {233,23,23,34,45};
//      value(marks);
//        System.out.println("The value after changes is: "+ marks[0]);
//    ---------- Method Overloading concept---------------
//    static void sam(){
//        System.out.println("My name is Sameen");
//    }
//    static void sam(int x){
//        System.out.println("My " +x +" is divided into 3 child");
//    }
//    static void sam(int x, int y){
//        System.out.println("My name is Sameen: " +x + " contains " +y);
//    }
//
//    public static void main(String[] args) {
//        sam();
//        sam (3000);
//        sam(40,3983);
//        System.out.println(sam());
//    }
//    ---------USING VARIABLE ARGUMENTS-------------
//    static int sum(int... arr){
//        int result = 1;
//        for (int a: arr){
//            result *= a;
//        }
//        return result;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("the multiplication of 2 and 3 is: "+ sum(2,3));
//        System.out.println("the multiplication of 2 and 3 is: "+ sum(2,3,2));
//    }

}







