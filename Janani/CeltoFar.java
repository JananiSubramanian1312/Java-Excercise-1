import java.util.Scanner;
class CeltoFar{
public static void main(String[] args)
{
Scanner read=new Scanner(System.in);
System.out.println("Enter the farenheit value");
float faren= read.nextFloat();
float celcius= ((faren-32)*5)/9;
System.out.println("The celcius value is:"+celcius);
}
}