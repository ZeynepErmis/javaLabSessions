import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class AccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("12345", "Zeynep");
        BankAccount bankAccount2 = new BankAccount("12347", "Test2");
        BankAccount bankAccount3 = new BankAccount("12346", "Test3");

        bankAccount1.deposit(300000);
        bankAccount2.deposit(5000);
        bankAccount3.deposit(12000);

        List<BankAccount> accountList = new ArrayList<>();
        accountList.add(bankAccount1);
        accountList.add(bankAccount2);
        accountList.add(bankAccount3);

        System.out.println(accountList.toString());

        for (BankAccount bankAccount : accountList) {
            System.out.println(bankAccount.getAccountName());
        }

        System.out.println("***COMPARABLE DEMO***");
        System.out.println("\nBefore Sort\n" + accountList);
        Collections.sort(accountList);
        System.out.println("\nAfter sort\n" + accountList);
    }

}
