import java.util.*;
public class Volume{
public static double SphereVolume(double radius)
{
double volume=(4.0/3.0)*(Math.PI)*Math.pow(radius,3);
return volume;
}
public static void main(String[] args)
{
Scanner read= new Scanner(System.in);
double diameter= read.nextDouble();
double radius= diameter/2;
double result=SphereVolume(radius);
System.out.println("The volume of sphere is:"+result);
}
}


