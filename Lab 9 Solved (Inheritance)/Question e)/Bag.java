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
        Item pen = new Pen("Mont Blanc", 5500);
        Item noteBook = new Notebook("Staedtlar Book", 450);

        // Bag operations
        Bag bag = new Bag(2); // created a bag to hold 4 items
        // adding Items into bag
        bag.addItem(pen);
        bag.addItem(noteBook);

        // checking total price of items in bag
        System.out.println("Bag total price = "+bag.getTotalPrice());

        // Searching and getting items from string name and direct item
        Item findItem = bag.getItem("Mont Blanc"); // searching based on string
        if(findItem instanceof Pen){
            Pen montBlanc = (Pen) findItem;
            montBlanc.write();
        }
        Item findItem2 = bag.getItem(noteBook); // searching based on Item object
        if(findItem2 instanceof Notebook){
            Notebook staedler = (Notebook) findItem2;
            staedler.flipPages();
        }
        bag.getItem("fail"); // fails

        // checks if all items were found
        System.out.println(findItem.getName() + " " + findItem2.getName());

    }
}