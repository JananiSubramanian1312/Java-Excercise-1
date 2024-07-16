import java.util.Scanner;
public class LargerInt{
public static void main(String args[]){
Scanner read= new Scanner(System.in);
System.out.println("Enter num1");
int num1= read.nextInt();
System.out.println("Enter num2");
int num2=read.nextInt();
if(num1>num2){
System.out.println(+num1 +"is larger");
}
else if(num1==num2)
{
System.out.println(+num1 +"&" +num2 +"are equal");
}
else
{
System.out.println(+num2 +"is larger");
}
}
}
