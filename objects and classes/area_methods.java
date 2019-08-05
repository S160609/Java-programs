import java.util.*;
class area_methods
{
int l,b;
void area()
{
l=60;
b=30;
System.out.println("Area of rectangle is:"+(l*b));
}
void area(float r)
{
double a=(Math.PI)*r*r;
System.out.println("area of circleis:"+a);
}
void area(int z)
{
int s=z*z;
System.out.println("Area of the square:"+s);
int l=4*z;
System.out.println("perimeter of the square:"+l);
}
void area(int x,int y)
{
int k=(x*y)/2;
System.out.println("area of Traingle is:"+k);
}
}
class main
{
public static void main(String [] args)
{
area_methods obj=new area_methods();
obj.area();
obj.area(10f);
obj.area(3);
obj.area(10,20);
}
}

