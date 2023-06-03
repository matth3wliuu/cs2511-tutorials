package example;

public class Shouter {

    private String message;

    Shouter() {
    }

    Shouter(String initMsg) {
        this.message = initMsg;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter();
        s.setMessage("hello world");
        s.shout();

        Shouter s2 = new Shouter("default message");
        s2.shout();

        s2.setMessage("new message");
        s2.shout();
        s.shout();

    }
}
