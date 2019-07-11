package foodService;



public class AddRequest {
    private FoodSupplier foodSupplier;
    private Product product;

    public AddRequest(FoodSupplier foodSupplier, Product product) {
        this.foodSupplier = foodSupplier;
        this.product = product;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public Product getProduct() {
        return product;
    }
    public int getProductQuantity(){
        return product.getProductQuantity();
    }
}
