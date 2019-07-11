package foodService;

public class SupplierDto {

    private FoodSupplier foodSupplier;
    private boolean isAdded;

    public SupplierDto(FoodSupplier foodSupplier, boolean isAdded) {
        this.foodSupplier = foodSupplier;
        this.isAdded = isAdded;
    }
}
