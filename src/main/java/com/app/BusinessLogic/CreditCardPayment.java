package com.app.BusinessLogic;

import org.springframework.web.bind.annotation.GetMapping;

public class CreditCardPayment implements Payment
{
    @Override
    @GetMapping("/PayCredit")
    public void pay(double price)
    {
        System.out.println("I have spent "+price+" dragons on a bunch of flowers...");
    }
}
