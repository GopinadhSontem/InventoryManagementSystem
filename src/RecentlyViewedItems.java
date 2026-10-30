import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems
{
    List<Item> items;
    int maxsize=10;

    public RecentlyViewedItems()
    {
       items = new LinkedList<>();
    }

    public void recentlyVieweditems(Item item)  //assuming user is passing the addresss
    {
         //remove the item if its already present so it can be moved to front
        items.remove(item);
        items.addFirst(item);  //adding the the right
        if(items.size() >maxsize)
            items.removeLast();  //removing old items

    }
}

