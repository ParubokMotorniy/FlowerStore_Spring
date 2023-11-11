package GroupingLogic;

import com.app.BusinessLogic.Delivery;
import com.app.BusinessLogic.Payment;

import java.util.LinkedList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Order
{
    private LinkedList<Item> orderItems;
    private Payment orderPayment;
    private Delivery orderDelivery;

    public void setOrderPayment(Payment orderPayment)
    {
        this.orderPayment = orderPayment;
    }

    public void setOrderDelivery(Delivery orderDelivery)
    {
        this.orderDelivery = orderDelivery;
    }

    double CalculateTotalPrice()
    {
        double sum = 0;
        for(Item trinket : orderItems)
        {
            sum += trinket.price();
        }
        return sum;
    }

    public void ProcessOrder()
    {
        System.out.println("Starting order processing...");
        ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);
        exec.schedule(() -> System.out.println("Your order has been processed!"), 3, TimeUnit.SECONDS);
    }

    public void AddItem(Item item)
    {
        if(!orderItems.contains(item))
        {
            orderItems.add(item);
        }
    }

    public void RemoveItem(Item item)
    {
        orderItems = (LinkedList<Item>) orderItems.stream().filter(x -> !x.equals(item)).collect(Collectors.toList());
    }
}
