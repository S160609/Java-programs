public class student_details
{
long number;
int id;
void display()
{
System.out.println("student details are:");
System.out.println("student number is:"+number);
System.out.println("student id no is:"+id);

}
}
class main
{
public static void main(String [] student)
{
student_details s1=new student_details();
s1.number=984802283;
s1.id=160609;
s1.display();
}
}