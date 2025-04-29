/*
3. Write a Java program to create an abstract class BankAccount with abstract methods deposit()
and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount
class and implement the respective methods to handle deposits and withdrawals for each account type.
*/



public class CurrentAccount extends BankAccount {



    public CurrentAccount( double balance,String name, String Iban, int age) {
        this.balance = balance;
        this.name = name;
        this.Iban = Iban;
        this.age = age;
    }


    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("insufficient balance");
        }
        else
            balance -= amount;
        System.out.printf("you have withdrawn %.2f now you have %.2f%n", amount , balance);
    }
    public void deposit(double amount){

        balance += amount;
        System.out.println("your current balance is now: " + balance);
    }
}
