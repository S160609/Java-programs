import java.util.*;
public class equals
{
public static void main(String [] args)
{
Scanner an=new Scanner(System.in);
System.out.println("enter a string:");
String s1=an.nextLine();
System.out.println("enter a string:");
String s2=an.nextLine();
boolean n=s1.equals(s2);
if(n==true)
{
System.out.println("both strings are same");
}
else
{
System.out.println("both strings are not same");
}
}
}

