package foodService;

public class FoodSupplier implements Producer {

    private String supplierName;

    public FoodSupplier(String supplierName) {
        this.supplierName = supplierName;

    }

    public String getSupplierName() {
        return supplierName;
    }


    @Override
    public void process() {
        System.out.println("default process");
    }
}
