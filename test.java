
class emp{
    int id;
    String name;
    float salary;
    void insert(int i,String n,float s)
    {
        
        
        id=i;
        name=n;
        salary=s;
    }
    void display()
    {
        System.out.println(id+" "+name+ " "+salary);
    }
}
class test{
    public static void main(String args[]) {
        emp e1= new emp();
        emp e2=new emp();
        System.out.println("Enter the details");
        e1.insert(2100,"Pratyush", 5356.0f);
        e2.insert(2101,"SUndar", 3565.0f);
        e1.display();
        e2.display();
        
    }
}