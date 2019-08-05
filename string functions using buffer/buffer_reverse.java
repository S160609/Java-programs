import java.util.*;
class buffer_reverse
{
public static void main(String [] args)
{
System.out.print("enter a string:");
Scanner a=new Scanner(System.in);
String s=a.nextLine();
StringBuffer b=new StringBuffer(s);
System.out.println(b.reverse());
}
}