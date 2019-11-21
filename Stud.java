import java.util.*;
class Student
{
 
   float sgpa;
   int usn;
   String name;
   int credits[]=new int[4];
   int marks[]=new int[4];
   
   void accept()
   { 
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the usn");
     usn=s.nextInt();
     System.out.println("Enter the name");
     name=s.next();
     System.out.println("Enter the credits for each subject");
     for(int i=0;i<4;i++)
     {
       credits[i]=s.nextInt();
     }
     System.out.println("Enter the marks for each subject");
     for(int i=0;i<4;i++)
     {
      marks[i]=s.nextInt();
     }
   }
   
   void sgpa()
   { 
     int gp;
     
     int total=0;
     int totalc=0;
     for(int i=0;i<4;i++)
     { if(marks[i]>=90)
       {
         gp=10;
      
       }
      else if(75<=marks[i] && marks[i] <90)
      {
       gp=9;
      }
      else if(60<=marks[i] && marks[i] <80)
      {
       gp=8;
      }
      else if(45<=marks[i] && marks[i] <60)
      {
         gp=7;
       }
      else
      {
        gp=6;
       }
      total+=gp*credits[i];
     }
     for(int i=0;i<4;i++)
     {
       totalc+=credits[i];
     }
     sgpa=(float)total/totalc;
  }
     void display()  
     {
      System.out.println("the sgpa is "+sgpa);
     }

}
class Stud
{
  public static void main(String args[])
  {
   Student ob=new Student();
   ob.accept();
   ob.sgpa();
   ob.display();
  }
 }

     

      
