import java.text.DecimalFormat;
import java.util.*;
public class IntegerGrades{
public static void main(String[] args)
{
Scanner read= new Scanner(System.in);
double grades[]=new double[20];
int count=0;
for(int i=0;i<20;i++)
{
double input= read.nextDouble();
if(input==-1)
{
break;
}
grades[count]=input;
count++;
}
for(int i=0;i<count;i++)
{
System.out.print(grades[i]+" ");
}
double avg= Average(grades,count);
DecimalFormat df= new DecimalFormat("#.##");
String round= df.format(avg);
System.out.println("The average is:"+round);
}
public static double Average(double grades[], int count)
{
double average;
double sum=0;
for(int i=0;i<grades.length;i++)
{
sum=sum+grades[i];
}
average= sum/count;
return average;
}
}


