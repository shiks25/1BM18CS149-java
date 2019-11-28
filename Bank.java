import java.util.*;
abstract class Account
{
  String cust_name,acc_type;
  long  acc_no;
  double bal=0.0;
  Scanner sc =new Scanner(System.in);
 void input()
{
   System.out.println("Enter the cst name,acc type and acc no.");
   cust_name=sc.next();
   acc_type=sc.next();
   acc_no = sc.nextInt();
}
void display()
{
 System.out.println("Balance="+bal);
}
void deposit()
{
 System.out.println("enter the amount to be deposited");
 double deposit=sc.nextDouble();
bal+=deposit;
}
void withdraw()
{
System.out.println("enter the amount to be withdrawn");
double draw=sc.nextDouble();
bal-=draw;
}
 void interestCal() {
  }
 void service(){
  }
}
class sav_acct extends Account
{
final r=5;
 int t;
double interest;
Scanner sc=new Scanner(System.in);
void input()
{
 super.input();
System.out.println("enter the time");
t=sc.nextInt();
}
void interestCall()
{
 interest= bal*(Math.pow(1+(r*0.01),t));
  bal=bal+interest;
}
void display()
{
 System.out.println("Interest="+interest);
super.display();
}
}
class curr_acc extends Account
{
Scanner s=new Scanner(System.in);
 final double min=1000.00;
final double ser=800.00;
void input()
{
super.input();
}
void service()
{
 if(bal<min)
   bal=bal-ser;
}
void display()
{
 super.display();
}
}
class Bank
{
 public static void main(String args[]) {
  Scanner s=new Scanner(System.in);
System.out.println("Enter 1 for savings 2. for current account");
int ch=sc.nextInt();
Account ref;
if(ch==1)
{
 ref=new sav_acc();
}
else
{
ref=new curr_acc();
}
ref.input();
ref.deposit();
ref.withdraw();
ref.interestCal();
ref.service();
ref.display();
}
}


  

 
 
