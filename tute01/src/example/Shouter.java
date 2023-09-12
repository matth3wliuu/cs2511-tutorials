package example;

public class Shouter {

    private String message;

    Shouter() {

    }

    // Constructor
    Shouter(String msg) {
        System.out.println(msg);
        this.setMessage(msg);
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public void shout() {
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("Shouter");
        shouter.setMessage("This is a new message");
        shouter.shout();

        Shouter shouter2 = new Shouter("Shouter2");
        shouter2.setMessage("Shouter2 is changing the message");

        shouter.shout();

        Shouter shouter3 = new Shouter();
        shouter3.setMessage("hello world");

        shouter3.shout();
    }
}
