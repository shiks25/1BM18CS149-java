import java.util.*;
class Publication
{
 String title;
double price;
void getdata()
{
 System.out.println("enter the title and price");
Scanner s=new Scanner(System.in);
title=s.next();
price=s.nextDouble();
}
void putdata()
{
System.out.println("title= "+title+"price = "+price);
}
}
class Book extends Publication
{
int pg_count;
void getdata()
{
super.getdata();
System.out.println("enter the page count");
Scanner s=new Scanner(System.in);
pg_count=s.nextInt();
}
void putdata()
{
super.putdata();
System.out.println("page count= "+pg_count);
}
}
class Tape extends Publication
{
Double pt;
void getdata()
{
super.getdata();
System.out.println("enter the playing time");
Scanner s=new Scanner(System.in);
pt=s.nextDouble();
}
void putdata()
{
super.putdata();
System.out.println("playing time = "+pt);
}
}
class Company
{
 public static void main(String args[]) {
 System.out.println("enter the no. of book objects");
Scanner s=new Scanner(System.in);
int m=s.nextInt();
Book b[] = new Book[m];
for(int i=0;i<m;i++)
{
 b[i] = new Book();
System.out.println("enter the details for book " +(i+1));
b[i].getdata();
if(b[i].pg_count > 500)
     b[i].putdata();
}
System.out.println("enter the no. of tape objects");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Tape t[] = new Tape[n];
for(int i=0;i<n;i++)
{
 t[i]=new Tape();
System.out.println("enter the details for tape " +(i+1));
ti].getdata();
t[i].putdata();
}
}
}