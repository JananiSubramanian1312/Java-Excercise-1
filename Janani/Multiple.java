import java.util.Scanner;
public class Multiple{
public static void main(String[] args)
{
Scanner read= new Scanner(System.in);
System.out.println("Enter num1:");
int num1=read.nextInt();
System.out.println("Enter num2:");
int num2=read.nextInt();
if(num1%num2==0){
System.out.println("first is the multiple of second");
}
else
{
System.out.println("first is not the multiple of second");
}
}
}