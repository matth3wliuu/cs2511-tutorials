package example;


public class Shouter {
    Shouter() {
        this.message = "Default message";
    }

    //  Thiis is a constructor that allows the user to pass me a message
    Shouter(String message) {
        // typically this fine but we generally prefer to just set member variables like we did before
        // setMessage(message);

        this.message = message;
    }

    Shouter(String message, int x) {
        this.message = message;
        System.out.println("Constructed a shouter with number: " + x);
    }

    // ? What should be the type of the message
        //  String

    // * if i have private variables / functions, classes outside cannot access this variable or function.
    private String message;

    // * use public only when you other clases to access this variable / functions (methods)
    // public double money;

    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public void setMessage(String message) {
        // This is an additional check to prevent someone from emptying from message
        if (message == "") {
            return;
        }

        this.message = message;
    }

    // ? should we use the getter inside the class
    // Nope (most of time), why do we need to

    public static void main(String[] args) {
        Shouter myShouter = new Shouter("Hello Matt");
        myShouter.shout();

        Shouter yourShouter = new Shouter("Hello Omer");
        yourShouter.shout();

        Shouter defaultShouter = new Shouter();
        myShouter.setMessage("This is a new message");
        myShouter.shout();

        // ! member variables in classes are complete disconnected from each other.
        yourShouter.shout();

        // ? why can i do this
        // * because this main method exists in the class
        // String blah = myShouter.message;

        // double x = myShouter.money;
    }
}