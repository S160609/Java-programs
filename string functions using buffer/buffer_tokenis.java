import java.util.*;
class buffer_tokenis
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter a string:");
String S=ob.nextLine();
StringTokenizer a=new StringTokenizer(S);
System.out.println(a.hasMoreTokens());
}
}