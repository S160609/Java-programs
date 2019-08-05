import java.util.Scanner;
public class recursion_factorial
{
long fact(int n)
{
if(n==1)
return 1;
else
return n*fact(n-1);
}
}
class main
{
public static void main(String[]args)
{
Scanner read=new Scanner(System.in);
System.out.print("enter a num:");
int a=read.nextInt();
recursion_factorial obj=new recursion_factorial();
long f=obj.fact(a);
System.out.println("factorial of "+a+" is:"+f);
}
}