import java.util.HashSet;

public class CustomerWishlist
{
    HashSet<Item> items;

    public CustomerWishlist()
    {
        this.items = new HashSet<>();
    }

    public void addToWishlist(Item item)
    {
        items.add(item);
    }
    public void  removeFromWishlist(Item item)
    {
        items.remove(item);
    }
}
