import java.util.*;
public class bubble_sort
{
public static void main(String [] args)
{
int n,i,j;
Scanner obj=new Scanner(System.in);
System.out.println("enter array size:");
n=obj.nextInt();
int a[]=new int[n];
System.out.println("enter elements of the array:");
for(i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
int temp=0;
for(i=n-1;i>0;i--)
{
for(j=0;j<i;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("sorted elements are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]+"\t");
}
}
}


