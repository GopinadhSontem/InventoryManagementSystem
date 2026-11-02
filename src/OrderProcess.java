import java.util.PriorityQueue;

public class OrderProcess
{
    PriorityQueue<Order> pq ;

    public OrderProcess() {
        this.pq = new PriorityQueue<>();
    }

    public void addOrder(Order order)
    {
        pq.offer(order);
    }
    public Order ProcessOrder()
    {
        return pq.poll();
    }


}
