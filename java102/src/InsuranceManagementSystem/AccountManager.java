package InsuranceManagementSystem;

import java.time.LocalDateTime;
import java.util.TreeSet;

public class AccountManager {
    private static TreeSet<Account> accounts = new TreeSet<>(new AccountComparator());


    public static Account login(String email, String password) throws Exception {
        for (Account a : accounts) {
            if (a.getUser().getEmail().equals(email) && a.getUser().getPassword().equals(password)) {
                a.setAuthenticationStatus(AuthenticationStatus.SUCCESS);
                a.getUser().setLastLogin(LocalDateTime.now());
                return a;
            }
        }
        throw new InvalidAuthenticationException("Invalid Authentication Exception!");
    }

    public static TreeSet<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(TreeSet<Account> accounts) {
        AccountManager.accounts = accounts;
    }
}
