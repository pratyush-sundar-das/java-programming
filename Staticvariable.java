class student{
    int roll;
    String name;
    static String college= "National Institute of Technology";
    student(int r, String n){
        roll=r;
        name=n;
    }
    void display(){
        System.out.println(roll+" "+name+" "+college);
    }
}
public class Staticvariable {
    public static void main(String args[]){
        student s1=new student(111,"Karan");
        student s2=new student(112,"Aryan");
        s1.display();
        student.college="Nalanda Institute of Technology";
        System.out.println("After changing static variable");
        s2.display();
    }
}
