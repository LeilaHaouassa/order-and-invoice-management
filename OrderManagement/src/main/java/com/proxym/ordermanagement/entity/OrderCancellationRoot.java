package com.proxym.ordermanagement.entity;


import javax.persistence.OneToOne;

public class OrderCancellationRoot extends RootClass {

    @OneToOne
    private OrderCancellation orderCancellation;
}
