// interface Many {
//  public abstract  void hence(String v);
//    public abstract int value(int n);
//}
//class both implements Many{
//   @Override
//   public int value(int n){
//       int b = 13;
//       b = b+n;
//       System.out.println(b);
//       return b;
//   }
//
//    @Override
//    public void hence(String v){
//        String n = "Hello Mr. ";
//        String b = n+v;
//        System.out.println(b);
//    }
//}
//
//class Interfaces {
//    public static void main(String[] args) {
//        both obj = new both();
//        obj.hence("Whats Your Name");
//        obj.value(32453);
//
//    }
//}
//interface many{
//    void happy();
//    int so(int b);
//}
//class inni implements many{
//    public void happy(){
//        System.out.println("Mai vaari mai vaari meri sammmiye");
//    }
//    public int so(int b){
//      int c;int a=2345678;
//      c =a+b;
//      return c;
//    }
//}
////class Interfaces{
////    public static void main(String[] args) {
////        inni obj = new inni();
////        System.out.println(obj.so(45678));
////    }
////}


class main{
    main(){
        System.out.println("Default");
    }
    main(int x){
        this();
        System.out.println(x);
    }
    main(int x, int y){
        this(3);
        System.out.println(x*y);
    }

    public static void main(String[] args) {
        new main(3,4);
    }
}