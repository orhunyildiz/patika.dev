package InsuranceManagementSystem;

public class BusinessAddress implements Address {
    private String country;
    private String city;
    private String openAddress;

    public BusinessAddress(String country, String city, String openAddress) {
        this.country = country;
        this.city = city;
        this.openAddress = openAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String getOpenAddress() {
        return openAddress;
    }

    private void setOpenAddress(String openAddress) {
        this.openAddress = openAddress + " " + getCity() + " / " + getCountry();
    }

    @Override
    public String getAddress() {
        return getOpenAddress();
    }

    @Override
    public void setAddress(String address) {
        setOpenAddress(address);
    }
}
