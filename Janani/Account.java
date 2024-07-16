import java.io.*;
public class Account{
int balance;
public void Debit(int amount)
{
if(amount>balance)
{
System.out.println("Debit amount exceeded the balance amount!!");
}
else
{
balance=balance-amount;
System.out.println("The balance is:"+balance);
}
}
public static void main(String[] args)
{
Account acc= new Account();
acc.balance=200000;
acc.Debit(10000);
}
}



