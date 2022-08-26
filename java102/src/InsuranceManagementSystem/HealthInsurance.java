package InsuranceManagementSystem;

import java.time.LocalDate;

public class HealthInsurance extends Insurance {
    public HealthInsurance(String name) {
        super(name);
    }

    @Override
    public Insurance calculate(Account account) {
        if (account.getAccountType() == AccountType.INDIVIDUAL) {
            setPrice(1500);
            setStartingDate(LocalDate.now());
            setExpirationDate(LocalDate.now().plusYears(3));
        }
        else if (account.getAccountType() == AccountType.ENTERPRISE) {
            setPrice(3500);
            setStartingDate(LocalDate.now());
            setExpirationDate(LocalDate.now().plusYears(2));
        }
        return null;
    }

}
