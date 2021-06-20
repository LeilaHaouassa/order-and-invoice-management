package com.proxym.ordermanagement.entity;

import javax.persistence.OneToOne;


public class OrderResponseRoot extends RootClass{

    @OneToOne
    private OrderResponse orderResponse ;

}
