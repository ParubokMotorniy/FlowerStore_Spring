package BusinessLogic;

public class CreditCardPayment implements Payment
{
    @Override
    public void pay(double price)
    {
        System.out.println("I have spent "+price+" dragons for a bunch of flowers...");
    }
}
