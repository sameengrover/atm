class Thy1 extends Thread{
   public Thy1(String name){
       super(name);
   }
   public void run(){
       int i =0;
       while(i<1){
           System.out.println("The methods of harry is: " +this.getName());
           i++;
       }
   }
}

class ThreadClassConstructor{
    public static void main(String[] args) {
        Thy1 t1 = new Thy1("harry");
        Thy1 t2 = new Thy1("harry1");
        Thy1 t3 = new Thy1("harry2");
        Thy1 t4 = new Thy1("harry3");
        Thy1 t5 = new Thy1("harry4 with highest priority");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

