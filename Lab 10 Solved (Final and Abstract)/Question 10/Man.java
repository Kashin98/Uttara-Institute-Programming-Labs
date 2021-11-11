
public class Man{
    private String name;
    private boolean married = false;
    private Woman wife;

    public Man(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name+" is eating");
    }

    public void marry(Woman wife){
        // check if both wife and man are not married
        if(!this.married && !wife.isMarried()){
            this.married = true; // making man married
            this.wife = wife; // setting passed woman as wife
            wife.setMarried(true); // making woman married
            wife.setHusband(this); // this man object as husband for the wife
            System.out.println(this.name + " has married " + wife.getName() + ", Congrats!" );
        }else {
            System.out.println("Cannot marry "+wife.getName());
        }
    }

    public void divorce(){
        if(this.married){
            this.married = false; // making man unmarried
            this.wife.setMarried(false); // making woman unmarried
            System.out.println(this.name + " has divorced " + wife.getName() + ", Congrats!" );
            wife.setHusband(null); // woman's husband is null as in nobody
            this.wife = null; // setting wife back to null
        }else {
            System.out.println(this.name+" is not currently married to anyone ");
        }
    }

    public void wifeName() {
        if(this.married){
            System.out.println(this.wife.getName());
        }else {
            System.out.println(this.name+" is not married");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }
}

class TestMarriage{
    public static void main(String[] args) {
        Man man = new Man("Kashin");
        Woman woman = new Woman("Nehina");
        Woman woman2 = new Woman("Sasha");
        man.eat();
        woman.work();

        man.wifeName(); // no answer since not married
        woman.husbandName(); // no answer since not married
        man.marry(woman); // Kashin marries Nehina
        man.wifeName();
        woman.husbandName();

        man.marry(woman2); // fails as man is already married to woman
        woman.divorce(); // Nehina divorces her current husband which is kashin
        man.marry(woman2); // Kashin is now divorced and so he can marry a new wife.
        woman.marry(man); // fails as man is already married
        woman.husbandName();
        woman2.husbandName();

    }
}