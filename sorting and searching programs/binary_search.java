import java.util.*;
public class binary_search
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
int l=n-1,f=0,m=0;
for(i=0;i<n;i++)
{
m=(f+l)/2;
if(a[m]==b)
{
System.out.println("element found");
break;
}
if(b>a[m])
f=m+1;
if(b<a[m])
l=m-1;
if(i==(n-1))
System.out.println("element not found");
}
}
}
