
public class object{
    int a;
    void display()
    {
        a=10;
        System.out.println(a);
    }
class main
{
    public static void main(String [] object)
    {
       object obj1 = new object();
        obj1.a=30;
          System.out.println("a value of object1 is:"+obj1.a);
          obj1.display();
            System.out.println("a value after calling display function is:"+obj1.a);
        
    }
    
}
