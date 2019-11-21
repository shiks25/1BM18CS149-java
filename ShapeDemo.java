import java.util.*;
abstract class Shape
{ 
int a,b;
abstract void printArea();
}
class Rectangle extends Shape
{
Rectangle()
{    
   System.out.println("Enter the length and breadth");
   Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
}
void printArea()
{
 System.out.println("area of rectangle= "+ a*b);
}
}
class Triangle extends Shape
{
Traingle()
{
   System.out.println("Enter the base and height");
   Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
}
void printArea()
{
 System.out.println("area of triangle= "+(0.5* a*b));
}
}
class Circle extends Shape
{
   Circle()
{
 System.out.println("Enter the radius");
   Scanner s=new Scanner(System.in);
    a=s.nextInt();
}
void printArea()
{
  System.out.println("area of circle= "+(3.14* a*a));
}
}
class ShapeDemo
{
public static void main(String args[]) {
 Shape ref=null;
   System.out.println("To find area of 1. rect \n 2. triangle \n 3. circle\n -1.exit");
   Scanner s=new Scanner(System.in);
    int ch;
    ch =s.nextInt();
  while(ch!=-1)
{
switch(ch)
{
  case 1:
	ref=new Rectangle();
   	break;
case 2:
	ref=new Triangle();
 	break;
case 3:
	ref=new Circle();
	break;
default:
	System.out.println("invalid choice");
}
ref.printArea();
System.out.println("enter next choice or -1 to exit");
ch=s.nextInt();
}
}
}

	
    









