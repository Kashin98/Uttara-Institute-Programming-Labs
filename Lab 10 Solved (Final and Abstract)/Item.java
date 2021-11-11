public class Item{
    private double price;
    private String name;
    private int serialNo;

    public Item(String name) {
        System.out.println("Single param constructor");
        if(name == null || name.trim().equals("") ){
            System.out.println("Invalid values");
        }else {
            this.name = name;
        }
        this.serialNo = (int)(Math.random()*1000);
    }

    public Item(String name, double price) {
        this(name);
        System.out.println("Double param constructor");
        if(price < 0 ){
            System.out.println("Invalid values");
        }else {
            this.price = price;
        }
    }

    public void itemDetails(){
        System.out.println(this.name + " | $" + this.price + " | Sl.No " + this.serialNo);
    }
}

class TestItem{
    public static void main(String args[]) {
        Item item1 = new Item("Egg", 45);
        item1.itemDetails();

        Item item2 = new Item("Milk");
        item2.itemDetails();
    }
}