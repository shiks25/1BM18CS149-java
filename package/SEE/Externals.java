package SEE;
import CIE.*;
import java.util.*;
 public class Externals extends Student{
 public int marks_see[]=new int[5];
 public void get_see(){
System.out.println("Enter the marks of the student in course ");
 for(int i=0;i<5;i++){
 
 Scanner s= new Scanner(System.in);
 marks_see[i]=s.nextInt();
 }
}
 public void display_see(){
 System.out.println("the marks of the student in SEE are");
 for(int i=0;i<5;i++){
 System.out.println(marks_see[i]);

 }
}
}