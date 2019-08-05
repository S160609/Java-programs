import java.util.*;
public class linear_search
{
public static void main(String [] args)
{
int n,i;
Scanner obj=new Scanner(System.in);
System.out.println("enter array size:");
n=obj.nextInt();
int a[]=new int[n];
System.out.println("enter elements of the array:");
for(i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
System.out.println("enter search element:");
int b=obj.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==b)
{
System.out.println("Element found");
}
else if(i==(n-1))
{
System.out.println("Element not found");
}
}
}
}

