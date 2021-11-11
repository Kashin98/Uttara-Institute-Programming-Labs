public class Bag{
    private Item[] bagArray;
    private int itemCount = 0; // keeps count and easy way to index array when adding item
    private int totalPrice = 0;

    public Bag(int bagSize) {
        this.bagArray = new Item[bagSize];
    }

    // would be better to use List collections but I assume it's not allowed.
    public void addItem(Item item){
        if(item == null){
            System.out.println("Invalid item");
        }else {
            if(itemCount >= bagArray.length){
                System.out.println("not enough space for item");
                return;
            }
            this.bagArray[itemCount] = item;
            itemCount++;
            totalPrice += item.getPrice();
        }
    }

    // Overloaded getItem methods which takes item object or just item name.
    public Item getItem(Item item){
        if(item == null){
            System.out.println("Invalid item");
            return null;
        }

        // i< item count is because I want the array to only search for the amount items added into the array. No
        // point searching whole array after adding one item since the rest of the values of array will be null and
        // throws nullpointerexception. Again, easy problem solvable with List collections.
        for(int i = 0; i < itemCount; i++){
            // set to ignore case, so eggs and Eggs don't show different value.
            if(item.getName().equalsIgnoreCase(bagArray[i].getName())){
                System.out.println(item.getName() + " was found");
                return bagArray[i];
            }
        }
        System.out.println("Item not found in bag");
        return null;
    }


    public Item getItem(String itemName){
        if(itemName == null || itemName.trim().equals("")){
            System.out.println("Invalid item");
            return null;
        }
        for(int i = 0; i < itemCount; i++){
            if(itemName.equalsIgnoreCase(bagArray[i].getName())){
                System.out.println(itemName + " was found");
                return bagArray[i];
            }
        }
        System.out.println("Item not found in bag");
        return null;
    }

    public int getTotalPrice(){
        return this.totalPrice;
    }
}


class TestBag{
    public static void main(String[] args) {
        //  Creating Items
        Item item1 = new Item("Eggs", 55);
        Item item2 = new Item("Bread", 45);
        Item item3 = new Item("Milk", 20);
        Item item4 = new Item("Butter", 50);
        Item item5 = new Item(null, -19); //  says item has invalid name or price, assigns default values.

        // Bag operations
        Bag bag = new Bag(4); // created a bag to hold 4 items
        // adding Items into bag
        bag.addItem(item1);
        bag.addItem(item2);
        bag.addItem(item3);
        bag.addItem(item4);
        bag.addItem(item5); // should fail as there is no space for more items

        // checking total price of items in bag
        System.out.println("Bag total price = "+bag.getTotalPrice());

        // Searching and getting items from string name and direct item
        Item findItem = bag.getItem("bread"); // searching based on string
        Item findItem2 = bag.getItem("eggs");
        bag.getItem("fail"); // fails
        bag.getItem(item5); // fails
        Item findItem3 = bag.getItem(item3); // searching based on Item object
        Item findItem4 = bag.getItem(item4);
        // checks if all items were found
        System.out.println(findItem.getName() + " " + findItem2.getName() + " " +findItem3.getName() + " " +findItem4.getName());

    }
}