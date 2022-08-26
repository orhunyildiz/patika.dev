package InsuranceManagementSystem;

import java.time.LocalDate;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String name) {
        super(name);
    }

    @Override
    public Insurance calculate(Account account) {
        if (account.getAccountType() == AccountType.INDIVIDUAL) {
            setPrice(2500);
            setStartingDate(LocalDate.now());
            setExpirationDate(LocalDate.now().plusYears(2));
        }
        else if (account.getAccountType() == AccountType.ENTERPRISE) {
            setPrice(5000);
            setStartingDate(LocalDate.now());
            setExpirationDate(LocalDate.now().plusYears(1));
        }
        return null;
    }
}
