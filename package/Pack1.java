import CIE.*;
import SEE.*;
import java.util.*;
 public class Pack1{
  public static void main(String args[]){ 
  
  
   final_marks();
   }
   static void final_marks(){
   int n;
  System.out.println("Enter the number of students");
  Scanner s= new Scanner(System.in);
  n=s.nextInt();
   for(int i=0;i<n;i++){
   Internals a=new Internals();
   Externals b=new Externals();
   System.out.println("for student"+(i+1));
   a.get_details();
   a.get_cie();
   b.get_see();
        a.display_details();
   	for(int j=0;j<5;j++){
 	System.out.println("final marks of course"+(j+1));
 	System.out.println(a.marks_cie[j]+b.marks_see[j]);
        }
   }
 
}
}