public class Food {
    private String name;
    private double price; // assuming double since no specification is given.

    public Food(String name, double price) {
        if(name == null || name.isEmpty() || price < 1 ){
            System.out.println("Enter valid food name");
        }else{
            this.name = name;
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("Enter valid food name");
        }else{
            this.name = name;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 1 ){
            System.out.println("Enter valid food price");
            return;
        }
        this.price = price;
    }
}
