import java.io.*;
public class Book{
String bookName;
int ISBNNumber;
String authorName;
String publisher;
public void Book(String bookName, int ISBNNumber,String authorName, String publisher)
{
this.bookName=bookName;
this.ISBNNumber=ISBNNumber;
this.authorName=authorName;
this.publisher=publisher;
}
public void setBookName(String bookName)
{
this.bookName=bookName;
}
public String getBookName()
{
return bookName;
}
public void setISBNNumber(int ISBNNumber)
{
this.ISBNNumber=ISBNNumber;
}

public int getISBNNumber()
{
return ISBNNumber;
}
public void setAuthorName(String authorName)
{
this.authorName=authorName;
}
public String getAuthorName()
{
return authorName;
}
public void setPublisher(String publisher)
{
this.publisher=publisher;
}
public String getPublisher()
{
return publisher;
}
public void getBookInfo(){
System.out.printf("The description of the book is:\n AuthorName:%s\n ISBNNumber:%d\n BookName:%s\n Publisher:%s\n",bookName,ISBNNumber,authorName,publisher);
}
public static void main(String[] args)
{
Book obj[]=new Book[30];
obj[1]=new Book();
obj[1].setBookName("Oliver twist");
obj[1].setISBNNumber(65);
obj[1].setAuthorName("Charles Dickens");
obj[1].setPublisher("Bentley's Miscellany")
obj[1].getBookInfo();
}
}


