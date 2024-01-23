class animal {
    void a(){
System.out.println("I am a parent class");
    }
    
}
class dog extends animal{
    void b(){
        System.out.println("I am a student class");
    }
}
class single{
    public static void main(String[] args) {
        dog ob=new dog();
        ob.b();
        ob.a();
    }
}