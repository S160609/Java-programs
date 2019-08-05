import java.util.*;
class key_input
{
public static void main(String ar[])
{
int b;
float d;
System.out.print("Enter a number:");
Scanner a=new Scanner (System.in);
b=a.nextInt();
System.out.println("entered number is:"+b);
System.out.print("Enter a number:");
Scanner c=new Scanner (System.in);
d=c.nextFloat();
System.out.print("Entered number:"+d);
System.out.print("Enter a String:");
Scanner e=new Scanner (System.in);
String j=e.nextLine();
System.out.println("entered string is:"+j);
}
}