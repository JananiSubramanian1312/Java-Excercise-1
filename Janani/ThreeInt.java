import java.util.Scanner;
public class ThreeInt{
public static void main(String[] args)
{
Scanner read=new Scanner(System.in);
int num1= read.nextInt();
int num2= read.nextInt();
int num3= read.nextInt();
System.out.println("The sum is:"+(num1+num2+num3));
System.out.println("The average is:"+(num1+num2+num3)/3) ;
System.out.println("The product is:"+(num1*num2*num3));
if(num1>num2 && num1>num3)
{
System.out.println(+num1 +"is the greatest");
}
else if(num2>num3 && num2>num1)
{
System.out.println(+num2 +"is the greatest");
}
else if(num3>num1 && num3>num2)
{
System.out.println(+num3 +"is the greatest");
}
if(num1<num2 && num1<num3)
{
System.out.println(+num1 +"is the smallest");
}
else if(num2<num3 && num2<num1)
{
System.out.println(+num2 +"is the smallest");
}
else if(num3<num1 && num3<num2)
{
System.out.println(+num3 +"is the smallest");
}
}
}

