import java.util.Scanner;
public class SumSubPdtDiv{
public static void main(String[] args)
{
Scanner read= new Scanner(System.in);
System.out.println("Enter num1");
int num1=read.nextInt();
System.out.println("Enter num2");
int num2=read.nextInt();
System.out.println("The sum is:"+(num1+num2));
System.out.println("The diff is:"+(num1-num2));
System.out.println("The pdt is:"+(num1*num2));
System.out.println("The quo is:"+(num1/num2));
}
}