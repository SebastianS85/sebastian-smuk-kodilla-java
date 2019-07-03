package com.kodilla.good.patterns.challenges;



public class ProductOrderService {


        private InformationService informationService;
        private OrderService orderService;
        private OrderRepository orderRepository;

        public ProductOrderService(final InformationService informationService,
                                   final OrderService orderService,
                                   final OrderRepository orderRepository) {
            this.informationService = informationService;
            this.orderService = orderService;
            this.orderRepository = orderRepository;
        }

        public OrderDto process(final OrderService orderService) {
            boolean isOrdered  = orderService.order(orderService.getUser(), orderService.getProduct(),
                    orderService.getOrderDate());

            if(isOrdered) {
                informationService.inform(orderService.getUser());
                orderRepository.createOrder(orderService.getUser(),orderService.getProduct(),orderService.getOrderDate());
                return new OrderDto(orderService.getUser(), true);
            } else {
                System.out.println("false");
                return new OrderDto(orderService.getUser(), false);

            }
        }
}

