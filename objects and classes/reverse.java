import java.util.*;
public class reverse
{
public static void main(String [] args)
{
String s1;
int i;
System.out.println("Enter a string:");
Scanner obj=new Scanner(System.in);
s1=obj.nextline();
String rev=" ";
for(i=s1.length-1;i>=0;i--)
{
rev=rev+s1.charAt(i);
System.out.println("String reverse is:");
System.out.println(rev);
}
}
}
