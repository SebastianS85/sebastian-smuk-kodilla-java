package foodService;

import java.util.HashMap;

public class AddRequestRetriever {

    private HashMap<String,FoodSupplier> foodSupplierHashMap=new HashMap<>();

    public AddRequestRetriever() {
        foodSupplierHashMap.put("bread",new SupplierZip1("abc Co."));
        foodSupplierHashMap.put("butter",new SupplierZip2("xyz Co."));


    }

    public AddRequest retrieve(String productName,int quantity) {

        if(foodSupplierHashMap.containsKey(productName)){
            FoodSupplier foodSupplier = foodSupplierHashMap.get(productName);
            return new AddRequest(foodSupplier,new Product(productName,quantity));
        }

        return null;
    }

}
