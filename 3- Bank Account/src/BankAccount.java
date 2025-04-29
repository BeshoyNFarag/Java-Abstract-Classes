/*
3. Write a Java program to create an abstract class BankAccount with abstract methods deposit()
and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount
class and implement the respective methods to handle deposits and withdrawals for each account type.
*/



public abstract class BankAccount {
    protected double balance;
    protected String name;
    protected String Iban;
    protected int age;

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);


}
