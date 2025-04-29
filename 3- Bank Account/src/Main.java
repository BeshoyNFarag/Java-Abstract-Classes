/*
3. Write a Java program to create an abstract class BankAccount with abstract methods deposit()
and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount
class and implement the respective methods to handle deposits and withdrawals for each account type.
*/

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(3500.2,"John Smith", "DE24 23", 22);
        BankAccount current = new CurrentAccount(3500.2,"Stacy", "DE44 23", 23);

        savings.deposit(100);
        current.deposit(100);
        System.out.println();
        savings.withdraw(100);
        current.withdraw(100);




    }
}