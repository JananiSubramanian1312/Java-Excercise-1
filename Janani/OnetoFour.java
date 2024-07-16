import java.util.Scanner;
public class OnetoFour{
public static void main(String[] args)
{
Scanner read=new Scanner(System.in);
int num1=read.nextInt();
int num2=read.nextInt();
int num3=read.nextInt();
int num4=read.nextInt();
System.out.println(num1+" "+num2+" "+num3+" "+num4);
System.out.print(num1+" ");
System.out.print(num2+" ");
System.out.print(num3+" ");
System.out.print(num4+" ");
System.out.printf("\n%d %d %d %d",num1,num2,num3,num4);
}
}