package InsuranceManagementSystem;

import java.util.ArrayList;

public abstract class Account {
    private User user;
    private ArrayList<Insurance> insurances;
    private AuthenticationStatus authenticationStatus;
    private AccountType accountType;

    public Account(User user, ArrayList<Insurance> insurances) {
        this.user = user;
        this.insurances = insurances;
    }

    public final void showUserInfo() {
        System.out.println("Kullanıcının adı: " + user.getFirstName() +
                "\nSoyadı: " + user.getLastName() +
                "\nE-maili: " + user.getEmail() +
                "\nŞifresi: " + user.getPassword() +
                "\nMesleği: " + user.getJob() +
                "\nYaşı: " + user.getAge() +
                "\nAdresleri:");
        for (Address address : getUser().getAddresses()) {
            System.out.println(address.getAddress());
        }
        System.out.println("Son Giriş Tarihi: " + user.getLastLogin());
        System.out.println("Kullanıcı Tipi: " + accountType);
        System.out.println("Sigortalar:");
        for (Insurance insurance : insurances) {
            System.out.println(insurance.getName() + " - " + insurance.getPrice() + " - " + insurance.getStartingDate() + " - " + insurance.getExpirationDate());
        }

    }

    public abstract void addInsurancePolicy(Insurance insurance);

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
