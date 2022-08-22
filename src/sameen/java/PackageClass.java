package sameen.java;
class MyThr extends Thread{
    public MyThr(int i){
        super(String.valueOf(i));
    }

    @Override
    public void run() {
        System.out.println("Thank you");
    }
}

class PackageClass{
    public static void main(String[] args) {
        MyThr obj = new MyThr(23);
        System.out.println("The ID of my string is: " +obj.getName());

    }
}