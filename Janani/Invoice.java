import java.io.*;
class Invoice{
String PartNumber;
String PartDescription;
int QuantityOfItem;
double PricePerItem;
public void Invoice(String PartNumber, String PartDescription, int QuantityOfItem, double PricePerItem)
{
this.PartNumber=PartNumber;
this.PartDescription=PartDescription;
this.QuantityOfItem=QuantityOfItem;
this.PricePerItem=PricePerItem;
}
public void setPartNumber(String PartNumber)
{
this.PartNumber=PartNumber;
}
public String getPartNumber()
{
return PartNumber;
}
public void setPartDescription(String PartDescription)
{
this.PartDescription=PartDescription;
}
public String getPartDescription()
{
return PartDescription;
}
public void setQuantityOfItem(int QuantityOfItem)
{
if(QuantityOfItem>0)
{
this.QuantityOfItem=QuantityOfItem;
}
else
{
this.QuantityOfItem=0;
}
}
public int getQuantityOfItem()
{
return QuantityOfItem;
}
public void setPricePerItem(double PricePerItem)
{
if(PricePerItem>0)
{
this.PricePerItem=PricePerItem;
}
else
{
this.PricePerItem=0.0;
}
}
public double getPricePerItem()
{
return PricePerItem;
}
public double getInvoice()
{
double amount=QuantityOfItem*PricePerItem;
return amount;
}
public static void main(String[] args)
{
Invoice InvoiceTest=new Invoice();
InvoiceTest.setPartNumber("1234");
System.out.println("your part number is:"+InvoiceTest.getPartNumber());
InvoiceTest.setPartDescription("xyz");
System.out.println("your part description is:"+InvoiceTest.getPartDescription());
InvoiceTest.setQuantityOfItem(5);
System.out.println("your Quantity of item is:"+InvoiceTest.getQuantityOfItem());
InvoiceTest.setPricePerItem(3800.00);
System.out.println("your price per item is:"+InvoiceTest.getPricePerItem());
System.out.println("Your invoice is:"+InvoiceTest.getInvoice());
}
}