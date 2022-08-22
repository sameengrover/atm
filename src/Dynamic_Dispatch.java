                                class A{
    public void test(){
        System.out.println("Hey, My mame is Google");
    }
    public int test(int x){
        System.out.println("Hello bro your age is:" +x);
        return x;
    }
    public void hello(){
        System.out.println("No,Your are not google");
    }
}
class B extends A{
    public void test(){
        System.out.println("hey, My name is Google of class B");
    }
}
public class Dynamic_Dispatch {
    public static void main(String[] args) {
        A obj = new B();
        obj.test();
    }
}
