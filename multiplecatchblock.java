public class multiplecatchblock {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch( Exception e ){
            System.out.println(e);
        }
        System.out.println("R");
    }
}
