package foodService;

public class SupplierZip2 extends FoodSupplier {

    public SupplierZip2(String supplierName) {
        super(supplierName);
    }
    @Override
    public void process(){
        System.out.println("Process supplier Zip 2");
    }
}
