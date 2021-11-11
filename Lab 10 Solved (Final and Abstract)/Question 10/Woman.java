
public class Woman{
    private String name;
    private boolean married = false;
    private Man husband;

    public Woman(String name) {
        this.name = name;
    }

    public void marry(Man husband){
        // check if both wife and man are not married
        if(!this.married && !husband.isMarried()){
            this.married = true; // making woman married
            this.husband = husband; // setting passed man as husbad
            husband.setMarried(true); // making man married
            husband.setWife(this); // this woman object is set as wife for the man
            System.out.println(this.name + " has married " + husband.getName() + ", Congrats!" );
        }else {
            System.out.println("Cannot marry "+husband.getName());
        }
    }

    public void divorce(){
        if(this.married){
            this.married = false; // making man unmarried
            this.husband.setMarried(false); // making woman unmarried
            System.out.println(this.name + " has divorced " + husband.getName() + ", Congrats!" );
            husband.setWife(null); // man's wife is null as in nobody
            this.husband = null; // setting husband back to null
        }else {
            System.out.println(this.name+" is not currently married to anyone ");
        }
    }

    public void work(){
        System.out.println(this.name+" is working");
    }

    public void husbandName() {
        if(this.married){
            System.out.println(this.husband.getName());
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

    public void setHusband(Man husband) {
        this.husband = husband;
    }
}
