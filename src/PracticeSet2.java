//class Monkey{
//    String jump(String abc){
//        String hash = "May i come";
//        hash = hash + abc;
//        return hash;
//    }
//    void bite(){
//        System.out.println(" I will kill you ");
//    }
//}
//interface BasicAnimal{
//    int eat(int a, int b);
//    void sleep();
//}
//class Human extends Monkey implements BasicAnimal{
//    public int eat(int a, int b){
//        int c = 12;
//        a = b;
//        b= c;
//        c = a;
//        return c;
//    }
//    public void sleep(){
//        System.out.println("I am void function");
//    }
//}
//public class PracticeSet2 {
//    public static void main(String[] args) {
//     BasicAnimal obj5 = new Human();
//        System.out.println(obj5.eat(13,14));
//        obj5.sleep();
//    }
//}
//--------------SECOND PROBLEM=-------------

interface TVRemote{
    void button();
}
interface SmartTVRemote extends TVRemote{
   void button();
}
class  PracticeSet2{
    public static void main(String[] args) {
        SmartTVRemote obj = new SmartTVRemote() {
            @Override
            public void button() {
                System.out.println("Its working fine now");
            }
        };
        obj.button();
        }

    }
