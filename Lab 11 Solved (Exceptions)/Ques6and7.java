public class Ques6and7 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.setAge(-3);
//        person.setName(null);
        // invoker's fault for allowing input as such to succeed, this would require invoker to fix his code.
        person.setAge(55);
        try {
            person.dance("salsa");
        }catch (DanceFailureException e){
            e.printStackTrace();
        }
    }
}

class Person{
    private String name;
    private int age;

    public void dance(String dance) throws DanceFailureException {
        if(this.age > 50 && dance.equalsIgnoreCase("salsa")){
            throw new DanceFailureException("Person too old to do salsa");
        }
        System.out.println(dance);
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if(name == null || name.trim().equals("")){
            throw new IllegalArgumentException("Invalid name provided");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            throw new IllegalArgumentException("Invalid age provided");
        }
        this.age = age;
    }
}

class DanceFailureException extends Exception{
    public DanceFailureException() {
    }

    public DanceFailureException(String message) {
        super(message);
    }
}