package foodService;

public class MyInformationService implements SupplierInformationService {
    @Override
    public void inform(FoodSupplier foodSupplier, Product product) {
        System.out.println("Load supplier data-" + foodSupplier.getSupplierName() + "product:" + product.getProductName() + " quantity " + product.getProductQuantity());
    }
}
