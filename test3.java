import java.util.*;
class student{
    int id;
    String name;
    void insert(int i,String n ){
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
class test3{
    public static void main(String args[]) {
        student s1=new student();
        student s2=new student();
        Scanner sc = new Scanner(System.in);
        int i=  nextInt();
        String n= nextLine();
        s1.insert(i,n);
        s2.insert(i,n);
        s1.display();
        s2.display();
    }
}
