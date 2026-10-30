public class Item implements Comparable<Item>
{
    private String id;
    private String name;
    private int quantity;
    private double price;

    public Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }


    //this and other object
    //you want this to comefirst return -1
    //you want other to comefitst return +1
    //else return 0
//    @Override
//    public  int compareTo(Item other)
//    {
////        if(this.price <other.price)
////            return -1;
////        else if(other.price < this.price)
////            return +1;
////        else return 0;
//        if(this.price!= other.price)
//            return Double.compare(this.price, other.price);
//        else
//            return other.quantity-this.quantity;
//         //return Double.compare(this.price,other.price);
//    }
  @Override
  public  int compareTo(Item other)
  { //string class had its own toStirng method, which will sort the string lexiographically
    return this.name.compareToIgnoreCase(other.name);
  }

    @Override
    public String toString()
    {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
