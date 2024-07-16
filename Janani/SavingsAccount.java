import java.io.*;
public class SavingsAccount{
static double annualInterestRate;
private double savingsBalance;
public SavingsAccount()
{
annualInterestRate=0.0;
savingsBalance=0.0;
}
public void SavingsAccount(double annualInterestRate, double savingsBalance)
{
this.annualInterestRate=annualInterestRate;
this.savingsBalance=savingsBalance;
}
public void setAnnualInterestRate(double annualInterestRate)
{
this.annualInterestRate=annualInterestRate;
}
public double getAnnualInterestRate()
{
return annualInterestRate;
}
public void setSavingsBalance(double savingsBalance)
{
this.savingsBalance=savingsBalance;
}
public double getSavingsBalance()
{
return savingsBalance;
}
public double CalculateMonthlyInterest() {
double calmonthlyInterest =(annualInterestRate * savingsBalance) / 12;
savingsBalance += calmonthlyInterest; 
return savingsBalance;
}
public static void ModifyInterestRate(double newInterestRate)
{
annualInterestRate=newInterestRate;
}
public static void main(String[] args)
{
SavingsAccount saver1= new SavingsAccount();
SavingsAccount saver2=new SavingsAccount();
saver1.setSavingsBalance(2000.00);
saver2.setSavingsBalance(3000.00);
SavingsAccount.ModifyInterestRate(0.05);
saver1.CalculateMonthlyInterest();
System.out.println("The new balance for saver1 is:"+saver1.getSavingsBalance());
SavingsAccount.ModifyInterestRate(0.04);
saver2.CalculateMonthlyInterest();
System.out.println("The new balance for saver2 is:"+saver2.getSavingsBalance());
}
}

