public class Item{
    private String name;
    private int price;

    public Item(String name, int price) {
        if(name == null || name.trim().equals("") || price < 0){
            System.out.println("Invalid name or price provided");
            // default values provided as I don't know how to make object creation return null
            this.name = "default";
            this.price = 0;
        }else{
            this.name = name.trim();
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}