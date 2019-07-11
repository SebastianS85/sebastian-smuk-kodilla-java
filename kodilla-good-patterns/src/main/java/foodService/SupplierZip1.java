package foodService;

public class SupplierZip1 extends FoodSupplier {

    public SupplierZip1(String supplierName) {
        super(supplierName);
    }
    @Override
    public void process(){
        System.out.println("Process supplier Zip 1");
    }
}
