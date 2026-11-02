import java.util.PriorityQueue;

public class Order implements Comparable<Order>
{
    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress)
    {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }
    public String getOrderId() {
        return orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public  int compareTo(Order other)
    {
        if(this.isExpress && other.isExpress)
            return  this.orderId.compareTo(other.orderId);
        if(this.isExpress)
            return -1;
         return +1;

    }

}
