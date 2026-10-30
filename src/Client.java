import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client
{
    static void main()
    {
        Book b1 = new Book("1","banana",3,5,"Gopi");
        Book b2= new Book("2","Pencil",2,20,"Divya");
        Book b3 = new Book("3","bat",1,400,"Ramya");
        Book b4= new Book("4","ball",10,400,"Pinky");
        Book b5= new Book("5","hat",11,200,"Manly");
        //List<Item> items = new ArrayList<>();
        Inventory <Book> book_invtry = new Inventory();
        book_invtry.addItems(b1);
        book_invtry.addItems(b2);
        book_invtry.addItems(b3);
        book_invtry.addItems(b4);
        book_invtry.addItems(b5);

//        Collections.sort(items);
//        System.out.println(items);
        System.out.println(book_invtry.getAllItems());
    }
}
