package InsuranceManagementSystem;

import java.time.LocalDate;

public class CarInsurance extends Insurance {
    public CarInsurance(String name) {
        super(name);
    }

    @Override
    public Insurance calculate(Account account) {
        if (account.getAccountType() == AccountType.INDIVIDUAL) {
            setPrice(2000);
            setStartingDate(LocalDate.now());
            setExpirationDate(LocalDate.now().plusYears(2));
        }
        else if (account.getAccountType() == AccountType.ENTERPRISE) {
            setPrice(8000);
            setStartingDate(LocalDate.now());
            setExpirationDate(LocalDate.now().plusYears(1));
        }
        return null;
    }
}
