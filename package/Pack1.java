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
    Internals a[]=new Internals[n];
   Externals b[]=new Externals[n];
   for(int i=0;i<n;i++){
   System.out.println("for student"+(i+1));
   a[i]=new Internals();
   b[i]=new Externals();
   a.get_details();
   a.get_cie();
   b.get_see();
   a.display_details();
   a.display_cie();
   b.display_see();
   	for(int j=0;j<5;j++){
 	System.out.println("final marks of course"+(j+1));
 	System.out.println(a[i].marks_cie[j]+b[i].marks_see[j]);
        }
   }
 
}
}
