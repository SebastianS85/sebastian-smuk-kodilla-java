package foodService;

public class ServiceProcessor {

    private SupplierInformationService supplierInformationService;
    private AddService addService;
    private SupplierRepository supplierRepository;

    public ServiceProcessor(SupplierInformationService supplierInformationService, AddService addService,
                            SupplierRepository supplierRepository) {
        this.supplierInformationService = supplierInformationService;
        this.addService = addService;
        this.supplierRepository = supplierRepository;
    }

    public SupplierDto process(final AddRequest addRequest) {
        boolean isAdded = addService.add(addRequest.getFoodSupplier(), addRequest.getProduct(),
                addRequest.getProductQuantity());
        if (isAdded) {
            supplierInformationService.inform(addRequest.getFoodSupplier(), addRequest.getProduct());
            addRequest.getFoodSupplier().process();
            supplierRepository.createNewSupplier(addRequest.getFoodSupplier(), addRequest.getProduct(), addRequest.getProductQuantity());
            return new SupplierDto(addRequest.getFoodSupplier(), true);
        } else {
            System.out.println("false");
            return new SupplierDto(addRequest.getFoodSupplier(), false);

        }
    }
}
