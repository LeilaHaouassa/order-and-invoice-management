package com.proxym.ordermanagement.entity;


import javax.persistence.OneToOne;

public class OrderChangeRoot extends RootClass {
    @OneToOne
    private OrderChange orderChange;
}
