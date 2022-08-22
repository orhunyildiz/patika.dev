package PatikaStoreExample;

public abstract class Product {
    private int id;
    private String productName;
    private double price;
    private String brandName;
    private String storage;
    private double inches;
    private String ram;

    public Product(int id, String productName, double price, String brandName, String storage, double inches, String ram) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        setBrandName(brandName);
        this.storage = storage;
        this.inches = inches;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        for (int i = 1; i <= Brand.getBrands().size(); i++) {
            if (brandName.equals(Brand.getBrands().get(i))) {
                this.brandName = brandName;
            }
        }
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
