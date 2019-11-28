package CIE;
import java.util.*;

 public class Internals extends Student{
 public int marks_cie[]=new int[5];
 public void get_cie()
{
 System.out.println("Enter the marks of the student in course ");
 for(int i=0;i<5;i++){
 
 Scanner s= new Scanner(System.in);
 marks_cie[i]=s.nextInt();
 }
}
 public void display_cie(){
 System.out.println("the marks of the student in CIE are");
 for(int i=0;i<5;i++){
 System.out.println(marks_cie[i]);

 }
}
}