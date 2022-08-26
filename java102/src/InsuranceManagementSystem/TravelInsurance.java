package InsuranceManagementSystem;

import java.time.LocalDate;

public class TravelInsurance extends Insurance {

    public TravelInsurance(String name) {
        super(name);
    }

    @Override
    public Insurance calculate(Account account) {
        if (account.getAccountType() == AccountType.INDIVIDUAL) {
            setPrice(1000);
            setStartingDate(LocalDate.now());
            setExpirationDate(LocalDate.now().plusYears(1));
        }
        else if (account.getAccountType() == AccountType.ENTERPRISE) {
            setPrice(3000);
            setStartingDate(LocalDate.now());
            setExpirationDate(LocalDate.now().plusYears(1));
        }
        return null;
    }
}
