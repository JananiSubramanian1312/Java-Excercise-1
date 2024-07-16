import java.io.*;
public class Employee{
String FirstName;
String LastName;
double MonthlySalary;
public void Employee(String FirstName,String LastName,double MonthlySalary)
{
this.FirstName=FirstName;
this.LastName=LastName;
this.MonthlySalary=MonthlySalary;
}
public void setFirstName(String FirstName)
{
this.FirstName=FirstName;
}
public String getFirstName()
{
return FirstName;
}

public void setLastName(String LastName)
{
this.LastName=LastName;
}
public String getLastName()
{
return LastName;
}
public void setMonthlySalary(double MonthlySalary)
{
if(MonthlySalary>0)
{
this.MonthlySalary=MonthlySalary;
}
else
{
this.MonthlySalary=0.0;
}
}
public double getMonthlySalary()
{
return MonthlySalary;
}
public static void main(String[] args)
{
Employee obj1=new Employee();
Employee obj2=new Employee();
obj1.setFirstName("JANANI");
obj1.setLastName("SUBRAMANIAN");
obj2.setFirstName("SINDHUJA");
obj2.setLastName("RAMESH");
obj1.setMonthlySalary(28500);
System.out.println(obj1.getFirstName()+obj1.getLastName()+"'s"+" "+"monthly salary is:"+obj1.getMonthlySalary());
obj2.setMonthlySalary(30000);
System.out.println(obj2.getFirstName()+obj2.getLastName()+"'s"+" "+"monthly salary is:"+obj2.getMonthlySalary());
obj1.setMonthlySalary(28500*1.1);
System.out.println(obj1.getFirstName()+obj1.getLastName()+"'s"+" "+"monthly salary after 10% hike is:"+obj1.getMonthlySalary());
obj2.setMonthlySalary(30000*1.1);
System.out.println(obj2.getFirstName()+obj2.getLastName()+"monthly salary after 10% hike is:"+obj2.getMonthlySalary());
}
} 