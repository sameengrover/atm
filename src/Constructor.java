//class myConstructor{
//    int ID;
//    String name;
//    public myConstructor(){
//        name = "myName";
//        ID = 23;
//    }
//    public myConstructor(String myName){
//        ID = 11;
//        name = myName;
//    }
//    String getName(){
//        return name;
//    }
//    int getID(){
//        return ID;
//    }
//
//}
//
//    public static void main(String[] args) {
//        myConstructor hello1 = new myConstructor();
//        myConstructor hello = new myConstructor("My name is Sameen");
//        System.out.println(hello.getName());
//        System.out.println(hello.getID());
//
//    }
//}
//---- Problem 2-----
class Cylinder{
   private int height;
   private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surface (){
        return 2*3.14* radius*radius + 2*radius *height;
    }
}
public  class Constructor {
    public static void main(String[] args) {
        Cylinder mera = new Cylinder();
        mera.setHeight(12);
        mera.setRadius(23);
        mera.getRadius();
        mera.getHeight();
        System.out.println(mera.surface());

    }
}