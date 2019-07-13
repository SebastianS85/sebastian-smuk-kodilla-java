package foodService;

public class Application {
    public static void main(String[] args) {
        AddRequestRetriever addRequestRetriever = new AddRequestRetriever();
        AddRequest addRequest = addRequestRetriever.retrieve("butter",300);

        ServiceProcessor serviceProcessor = new ServiceProcessor(new MyInformationService(), new MyAddService(), new MySupplierRepository());
        serviceProcessor.process(addRequest);

    }
}
