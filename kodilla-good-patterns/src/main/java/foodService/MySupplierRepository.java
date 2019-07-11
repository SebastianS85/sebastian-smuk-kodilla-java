package foodService;

public class MySupplierRepository implements SupplierRepository {

    public void createNewSupplier(FoodSupplier foodSupplier, Product product, int productQuantity){

        System.out.println(foodSupplier.getSupplierName()+" "+"added to repository:"+" "+product.getProductName()+" - "+product.getProductQuantity()+"piece");
    }
}
