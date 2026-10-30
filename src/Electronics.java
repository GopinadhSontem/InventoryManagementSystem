public class Electronics extends Item
{
    private  int warrenty;

    public Electronics(String id, String name, int quantity, double price, int warrenty) {
        super(id, name, quantity, price);
        this.warrenty = warrenty;
    }

    public int getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(int warrenty) {
        this.warrenty = warrenty;
    }

}
