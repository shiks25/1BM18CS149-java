import java.util.*;
class Book
{
 String name,author;
 int num_pages;
 double price;
 Book()
 {
   name="\0";
   author="\0";
   price=0.0;
   num_pages=0;
}
void set_det()
{ 
 Scanner s= new Scanner(System.in);
 name=s.next();
 author=s.next();
 price=s.nextDouble();
 num_pages=s.nextInt();
}

public String toString()
{
  String s="Name :"+name+"\n Author="+author+"\n price="+price+"\n pg no.="+num_pages ;
  return s;
}
void get_det()
{
 System.out.println(toString());
  }
}
class BookDemo
{
 public static void main(String args[]){
  Scanner s= new Scanner(System.in);
  System.out.println("Enter the no. of book objects");
  int n=s.nextInt();
  Book obj[]=new Book[n];
  for(int i=0;i<n;i++)
 {
   obj[i]=new Book();
 }
  for(int i=0;i<n;i++){
  System.out.println("Enter name,author,price,no. of pages of book "+i+1);
   obj[i].set_det();
 }
 for(int i=0;i<n;i++)
{
 System.out.println("Details of book"+(i+1));
 obj[i].get_det();
   }
 }
}