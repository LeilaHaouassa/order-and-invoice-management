package com.proxym.ordermanagement.entity;

import javax.persistence.OneToOne;


public class OrderResponseSimpleRoot extends RootClass {

    @OneToOne
    private OrderResponseSimple orderResponseSimple;
}
