public class JavaException2 {
    public static void main(String[] args) {
        try{
            int arr[]={1,2,3,4};
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } 
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code......");
    }
}
