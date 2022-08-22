interface Abc {
    void Prateek(String Chd);
    int PrateekKiSaheli(int n);
    private void babu() {
        System.out.println("Mele babu ne thaana thaaya");
    }
    default int baby(){
        babu();
        int a=4;
        a++;
        System.out.println(a);
        return 0;
    }
}
interface Shukla{
    void glosys();
    void tms();
}
class MoneyBhai{
    void Mukesh(){
        System.out.println("Close kar yaar jldi");
    }
}
class Hari extends MoneyBhai implements Shukla,Abc{

    public void Prateek(String chd){
        String a ="Bhai Rishikesh Chle";
        a = a +chd;
        System.out.println(a);
    }
    public int PrateekKiSaheli(int n){
        String oyo= "Babu mujhe " +n+" rupee chahiye";
        System.out.println(oyo);
        return -1;
    }
    public void glosys(){
        System.out.println("Money Glosys Down Hogya");
    }
    public void tms(){
        System.out.println("utilisation uper chli gyi money bhai");
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Shukla obj3 = new Hari();
        obj3.glosys();
        Hari obj2 = new Hari();
        obj2.baby();
        Abc obj4 = new Hari();
        obj4.PrateekKiSaheli(400);
    }
}
