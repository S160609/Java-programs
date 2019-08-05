public class rectangle
{
void display(int x,int y)
{
System.out.println("area of rectangle is:"+(x*y));
System.out.println("perimeter of rectangle is:"+(2*(x+y)));
}
}
class main
{
public static void main(String [] args)
{
rectangle anju=new rectangle();
anju.display(5,6);
}
}
