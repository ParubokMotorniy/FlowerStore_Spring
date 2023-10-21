package BusinessLogic;

public class PayPalPayment implements Payment
{
    @Override
    public void pay(double price)
    {
        System.out.println("Elon Musk has just ripped me off " +price+" dollars.");
    }
}
