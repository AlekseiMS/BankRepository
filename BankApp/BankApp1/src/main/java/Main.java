import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Client client1 = new Client(1, "Клюев Я.А.", "password");
        Client client2 = new Client(2, "Иванов И.И.", "qwerty123");

        Account acc1 = new DebitAccount(1, 6, client1, 1000);
        Account acc2 = new CreditAccount(2, 10, client1, 20000);
        Account acc3 = new CreditAccount(3, 19, client1, 1500);

        Account acc4 = new DebitAccount(4, 5, client2, 15000);
        Account acc5 = new CreditAccount(5, 17, client2, 3000);

        List<Account> accountList = Arrays.asList(acc1, acc2, acc3, acc4, acc5);

        System.out.println(acc2);
        acc2.processPercentage();
        System.out.println(acc2);
    }
}