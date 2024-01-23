class student{
    int id;
    String name;
    void insert(int i,String n){
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
class test2{
    public static void main(String args[]) {
        student s1=new student();
        student s2=new student();
        s1.insert(23,"Pratyush");
        s2.insert(34,"Rinku");
        s1.display();
        s2.display();
    }
}
