package InsuranceManagementSystem;

import java.util.ArrayList;

public class Enterprise extends Account {
    public Enterprise(User user, ArrayList<Insurance> insurances) {
        super(user, insurances);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {
        getInsurances().add(insurance);
    }
}
