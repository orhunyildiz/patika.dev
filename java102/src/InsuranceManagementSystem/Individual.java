package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Individual extends Account {
    Scanner scanner = new Scanner(System.in);

    public Individual(User user, ArrayList<Insurance> insurances) {
        super(user, insurances);
        this.setAccountType(AccountType.INDIVIDUAL);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {
        getInsurances().add(insurance);
    }
}
