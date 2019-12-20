import java.util.*;
abstract class Superc
{
    int x,y;
    float d;
    abstract void get();
    abstract double mul(int xo,float dec);
    
}
abstract class Subc extends Superc
{
    int z;
    
    
    void get()
    {
        System.out.println(x +","+y+","+z);
    }
    abstract double mul(int xo,float dec);
}
class sub extends Subc
{  
    
    sub(int x,int y,int z,float d)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    
        this.d=d;
    }
    
    void get()
    {
        super.get();
        System.out.println(z);
    }
    double mul(int x,float d)
    {
        this.d=d;
        return x*d;
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	   
	      Superc ref = new sub(Integer.parseInt(args[0]),6,7,8);
		   ref.get();
		
		
		System.out.println("product is"+ref.mul(3,Integer.parseInt(args[2])));
	}
}
