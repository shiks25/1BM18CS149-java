import java.util.*;
class Quadratic
{ public static void main(String args[])
 { int a,b,c,d;
  double r1,r2;
   System.out.println("enter the numbers :");
   Scanner s=new Scanner(System.in);
   a=s.nextInt();
   b=s.nextInt();
   c=s.nextInt();
   
   d=(b*b)-(4*a*c);
 if(d==0)
 {
  System.out.println("The real and equal roots are"+(-b/(2*a)));
}
   if(d>0)
   {
     r1=(double)(-b+Math.sqrt(d))/(2*a);
     r2=(double)(-b-Math.sqrt(d))/(2*a);
     System.out.println("the roots are "+ r1 + "and " + r2);
    }
  else
  {
    System.out.println("no real solutions");
  }
 }
}

 
