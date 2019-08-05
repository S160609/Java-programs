import java.util.*;
class buffer_tokens
{
public static void main(String [] args)
{
System.out.println("Enter a string:");
Scanner a=new Scanner(System.in);
String s=a.nextLine();
StringTokenizer b=new StringTokenizer(s);
System.out.println("No.of tokens="+(b.countTokens()));
}
}
