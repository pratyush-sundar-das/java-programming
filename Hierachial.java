class college{
    void ax(){
        System.out.println("I am college");
    }
}
class department extends college{
    void bx(){
        System.out.println("I am department");
    }
}
class section extends college{
    void cx(){
        System.out.println("I am section");
    }
}
class Hierachial{
    public static void main(String[] args) {
        section ob = new section();
        department ob2=new department();
        ob.ax();
        ob.cx();
        ob2.bx();
        ob2.ax();
        
    }
}