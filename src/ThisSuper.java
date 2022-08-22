//class ThisBase{
//    public int getA() {
//        return a;
//    }
//    int a;
//    public ThisBase(int x){
//        this.a =x;
//        System.out.println("Hey ");
//    }
//    public ThisBase(){
//        System.out.println("I am Constructor");
//    }
//        }
//        class DerivedBase extends ThisBase{
//public DerivedBase(){
//    System.out.println("Default contructor");
//}
//            public DerivedBase(int x, int y) {
//                super(x);
//                System.out.println("The value of y :" +y);
//            }
//        }
//
//public class ThisSuper {
//
//
//    public static void main(String[] args) {
//        printMy(7);
//    }
//
//    private static void printMy(int i) {
//        if(i==0) return;
//        System.out.println(i);
//        printMy(i-1);
//    }
//}
