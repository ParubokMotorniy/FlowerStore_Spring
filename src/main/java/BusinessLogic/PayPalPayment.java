package BusinessLogic;

import org.springframework.web.bind.annotation.GetMapping;

public class PayPalPayment implements Payment
{
    @Override
    @GetMapping("/PayPal/")
    public void pay(double price)
    {
        System.out.println("Elon Musk has just ripped me off " +price+" dollars.");
    }
}
