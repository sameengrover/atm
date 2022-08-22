import java.util.ArrayList;
class Student1{
    int rollNo ;
    String name;
    int marks;

    public Student1(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        String n ="Name: "+this.name+" Roll No. "+this.rollNo+" Marks: "+this.marks +"\n";
//        System.out.println(n);
        return n;
    }

}
class NumberTo{
    public static void main(String[] args) {
        Student1 stu = new Student1(123, "Sameen" , 34);
        Student1 stu1 = new Student1(234, "Prateek" , 45);
        Student1 stu2 = new Student1(234, "Shujaat" , 45);
        Student1 stu3 = new Student1(256, "Akshay" , 45);
        Student1 stu4 = new Student1(344, "toosi" , 45);
        Student1 stu5 = new Student1(345, "Hello" , 23);

        ArrayList<Student1> ab = new ArrayList<>();
        ArrayList<Integer> ab1 = new ArrayList<>();
        ab.add(stu);
        ab.add(stu1);
        ab.add(stu2);
        ab.add(stu3);
        ab.add(stu4);
        ab.add(stu5);
        ab.remove(stu1);
        System.out.println();
    }
}