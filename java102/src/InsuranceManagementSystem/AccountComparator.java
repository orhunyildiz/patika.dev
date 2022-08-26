package InsuranceManagementSystem;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getUser().getFirstName().compareTo(o2.getUser().getFirstName());
    }
}
