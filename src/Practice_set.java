public class Practice_set {
//    ------------- print the table of any number--------------
//    static void mul(int n){
//        for(int i=0; i<=10; i++){
//            System.out.format("%d X %d = %d\n" , +i, +n, +i*n );
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The table is: ");
//        mul(8);
//
//    }
//--------------- Print * that we gave the number----------------
//    static void multi(int n){
//        for (int i=0; i<n; i++){
//            for(int j=0;j<i+1; j++ ){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        multi(8);
//    }
    static int rec(int n){
        if (n==1){
            return 1;
        }else {
            return n+ rec(n-1);

        }
    }

    public static void main(String[] args) {
//        rec(3);
//        System.out.println("the sum is:" + rec(3));


        // Array (Sorted -
        int [] arr = {4,5,8,10,50,58,106};

        int target = 106;

//        System.out.println(findnum(arr, target));

    }

//    private static boolean findnum(int[] arr, int target) {
////        for(int i=0; i<arr.length; i++){
////            if(arr[i]==target) return true;
////        }
////        return false;
//        int mid = arr[arr.length / 2];
//
//        if (mid == target) return true;
//
//        for(int i = 0; )
//
//
//    }


}
