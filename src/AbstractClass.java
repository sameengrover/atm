
abstract class Abs{
    void Abs(){
        System.out.println("This is the Abs Class");
    }
    abstract public void hey();
}
class derv extends Abs{
     int a;
int b; int c;
    public void hey(){
        System.out.println("Hey Google");
    }
    public void sam(int x, int y){
        this.a =x;
        this. b =y;
        c = a+b;
        System.out.println("The value is:"+ c);
    }
}
class derv1 extends Abs{
    public void hey(){
        System.out.println("My name is Sameen");
    }

}

public class AbstractClass {
    public static void main(String[] args) {
    derv obj = new derv();
    obj.sam(34,56);
    }
}
