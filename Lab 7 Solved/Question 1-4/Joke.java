public class Joke{
    static int objectCount = 0; // class scoped var
    private String text;

    // instance initializer that only runs when object is created.
    {
        objectCount++;
    }

    public Joke(String text){
        if (text == null|| text.trim().equals("")){
            System.out.println("Enter Valid value");
        }else{
            this.text = text;
        }
    }

    public void print(){
        System.out.println(this.text);
    }

}

class TestJoke{
    public static void main(String[] args) {
        System.out.println(Joke.objectCount);
        Joke joke = new Joke("Hilarious Joke");
        joke.print();
        for(int i = 0; i < 50; i++){
            new Joke("1");
        }
        System.out.println(Joke.objectCount);
    }
}