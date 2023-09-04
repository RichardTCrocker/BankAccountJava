public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts

        BankAccount richard_account = new BankAccount();
        BankAccount Katie_account = new BankAccount();
        BankAccount tyler_account = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        richard_account.checkingDeposit(1000);
        Katie_account.savingsDeposit(2000);
        tyler_account.checkingDeposit(1500);

        System.out.println(richard_account.getCheckingBalance());
        System.out.println(Katie_account.getSavingsBalance());
        System.out.println(tyler_account.getCheckingBalance());

        // - each deposit should increase the amount of totalMoney

        richard_account.deposit(1000, "savings");
        System.out.println(richard_account.getSavingsBalance());


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        richard_account.withdraw(500, "checking");
        System.out.println(richard_account.getCheckingBalance());
        Katie_account.withdraw(500, "checking");

        // - each withdrawal should decrease the amount of totalMoney
        System.out.println(BankAccount.getTotalMoney());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getAccounts());
        richard_account.getBalance();
        Katie_account.getBalance();


    }
}
