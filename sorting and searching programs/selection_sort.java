import java.util.*;
public class selection_sort
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
for(i=0;i<n;i++)
{
int min=i;
for(j=i+1;j<n;j++)
{
if(a[min]>a[j])
{
int temp;
temp=a[min];
a[min]=a[j];
a[j]=temp;
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

