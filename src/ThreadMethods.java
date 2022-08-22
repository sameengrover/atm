class Myth1 extends Thread{
    public void run(){
        int i=0;
        while(i<2){
            System.out.println("This is the While loop");
            i++;
        }
    }
}
class Myth2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("This is the infinite loop");
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
    public class ThreadMethods {
    public static void main(String[] args) {
        Myth1 obb = new Myth1();
        Myth2 obb1 = new Myth2();
        obb1.start();
//        obb.start();
        System.out.println(obb.getState());

    }
}
