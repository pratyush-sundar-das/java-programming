class a
{
    void aa()
    {
        System.out.println("Pratyush");
    }
}
class b extends a
{
    void bb()
    {
        System.out.println("Rinku");
    }
}
class c extends b
{
    void cc()
    {
        System.out.println("Sipul");
    }
}
class multilevel{
    public static void main(String[] args) {
        c ob=new c();
        ob.cc();
        ob.bb();
        ob.aa();
    }
}