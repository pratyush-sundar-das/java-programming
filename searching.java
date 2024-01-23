import java.util.Scanner;
class searching{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n = sc.nextInt();
int i;
System.out.println("Enter the array elements:\n");
for(i=0;i<n;i++)
{
int a[i]= sc.nextInt();
}
System.out.println("Enter element to search:");
int e= sc.nextInt();
for(i=0;i<n:i++)
{
if(a[i]==x)
break;
}
if(i<n)
{
System.out.println("ELement found at index %d",i);
}
else
{
System.out.println("Element not found");
}
}
}
