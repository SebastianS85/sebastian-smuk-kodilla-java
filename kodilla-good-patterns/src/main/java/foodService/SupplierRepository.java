package foodService;

public interface SupplierRepository {

    public void createNewSupplier(FoodSupplier foodSupplier, Product product, int productQuantity);
}
