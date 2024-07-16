import java.io.*;
public class Date
{
int month;
int day;
int year;
public void Date(int month, int day, int year)
{
this.month=month;
this.day=day;
this.year=year;
}
public void setMonth(int month)
{
this.month=month;
}
public int getMonth()
{
return month;
}
public void setDay(int day)
{
this.day=day;
}
public int getDay()
{
return day;
}
public void setYear(int year)
{
this.year=year;
}
public int getYear()
{
return year;
}
public void displayDate()
{
System.out.println(+getMonth()+"/"+getDay()+"/"+getYear());
}
public static void main(String[] args)
{
Date date= new Date();
date.setMonth(12);
System.out.println("The month is:"+date.getMonth());
date.setDay(13);
System.out.println("The day is:"+date.getDay());
date.setYear(2002);
System.out.println("The year is:"+date.getYear());
System.out.println("The date is:");
date.displayDate();
}
}
