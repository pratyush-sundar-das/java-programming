import java.net.SocketTimeoutException;

public class nullpointerexception {
    public static void main(String[] args) {
        try {
            String s= null;
            System.out.println(s.length());
    }
    catch(NullPointerException e){
System.out.println(e);
    }
    System.out.println("Rest ....");
}
}