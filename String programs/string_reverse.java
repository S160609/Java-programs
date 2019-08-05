import java.util.Scanner;
public class string_reverse
{
public static void main(String [] args)
{
System.out.println("Enter a string:");
Scanner obj=new Scanner(System.in);
String c=obj.nextLine();
char a[]=c.toCharArray();
int b=a.length-1;
int i=0,j;
char temp;
for(j=b;j>b/2;j--)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
i++;
}
for(i=0;i<=b;i++)
System.out.print(a[i]);
}
}