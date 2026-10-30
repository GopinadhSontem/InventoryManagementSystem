import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Item>
{
   private HashMap<String,T> itemsmap = new HashMap<>();

   public Inventory()
   {  //initialzing the hashmap in the constuctor
       itemsmap = new HashMap<>();
   }

   public void addItems(T item)
   {
       if(item.getQuantity()<0)
           throw new RuntimeException("Quantitiy cannot be negative");
       if(item == null)
           throw new NullPointerException();
       if(itemsmap.containsKey(item.getId()))
           throw new RuntimeException("item: "+item.getId() + "already exists....");
       //business  logic
       itemsmap.put(item.getId(),item);
   }
   public  void removeItems(String id)
   {
       if( !itemsmap.containsKey(id))
       {
           throw new RuntimeException("Item not found ");
       }
       itemsmap.remove(id);
   }

   public Item getItem(String id)
   {
       if( !itemsmap.containsKey(id))
       {
           throw  new RuntimeException("Item with the "+ id +"  not found");
       }
       return itemsmap.get(id);
   }

   public List<T> getAllItems()
   {
       return new ArrayList(itemsmap.values());
   }

}
