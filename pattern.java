import java.util.*;
class pattern{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
int i,j;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}

