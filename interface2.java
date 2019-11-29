import java.util.*;
interface safe_driving 
{
double safe_speed=50;
public void Speed_of_the_vehicle();
}
class drive implements safe_driving
{

public void Speed_of_the_vehicle()
{
double speed;
System.out.println("enter the current speed of the vehicle");
Scanner s=new Scanner(System.in);
speed=s.nextDouble();
if(speed>=safe_speed)
{
System.out.println("drive slow you drunkard!");
}
else
{
System.out.println("safe driving,good job..");
}

}
}
class Main
{
    public static void main(String args[]){
        drive d=new drive();
        d.Speed_of_the_vehicle();
}
}
