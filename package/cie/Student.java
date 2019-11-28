package CIE;
import java.util.*;
public class Student
{
  public String usn;
  public String name;
  public  int sem;
  public void get_details(){
  Scanner s= new Scanner(System.in);
  System.out.println("Enter the details");
  usn=s.next();
  name=s.next();
  sem=s.nextInt();
  }
public void display_details(){
 System.out.println("usn="+usn+"name="+name+"sem="+sem);
}
}