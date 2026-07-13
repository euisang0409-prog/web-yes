package com.korea.architecture.test;

import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	private final CustomerService customerService;
    private final TravelProductService travelProductService;

    public ReservationService(CustomerService customerService,
            TravelProductService travelProductService) {
this.customerService = customerService;
this.travelProductService = travelProductService;
}
    public void reserve() {
        System.out.println("여행 예약을 시작합니다.");
        customerService.checkCustomer();
        travelProductService.checkTravelProduct();
        System.out.println("여행 예약이 완료되었습니다.");
    }
    
    
}
