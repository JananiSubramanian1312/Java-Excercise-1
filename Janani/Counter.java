import java.util.Scanner;
public class Counter{
public static void main(String[] args){
Scanner read= new Scanner(System.in);
int ar[]= new int[10];
int counter=0;
int max=0;
for(int i=0;i<10;i++)
{
ar[i]=read.nextInt();
counter++;
System.out.println("The counter value:"+counter);
System.out.println("The number is:"+ar[i]);
if(ar[i]>max)
{
max=ar[i];
}
System.out.println("The largest number is"+max);
}
}
}
