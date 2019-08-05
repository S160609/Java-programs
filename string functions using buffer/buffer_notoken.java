import java.util.*;
public class buffer_notoken
{
public static void main(String [] args)
{
System.out.println("Enter a string:");
Scanner a=new Scanner(System.in);
String s=a.nextLine();
StringTokenizer b=new StringTokenizer(s,"_,. ");
int n=b.countTokens();
System.out.println("No.of tokens= "+n);
}
}