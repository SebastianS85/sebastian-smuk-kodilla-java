package foodService;

public class MyAddService implements AddService {
    @Override
    public boolean add(FoodSupplier foodSupplier, Product product, int productQuantity) {
        if (foodSupplier == null || product == null | productQuantity == 0) {
            return false;
        }


        return true;

    }
}
