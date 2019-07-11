package foodService;

public class AddRequestRetriever {

    public AddRequest retrieve() {
        SupplierZip1 firstSupplier=new SupplierZip1("abc Food Co.");
        Product eggs=new Product("eggs",200);
        SupplierZip2 secondSupplier= new SupplierZip2("xyz Co.");
        Product bread=new Product("bread",300);

        return new AddRequest(firstSupplier,bread);
    }

}
