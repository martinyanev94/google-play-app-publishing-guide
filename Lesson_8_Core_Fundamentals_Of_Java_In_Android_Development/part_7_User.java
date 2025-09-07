public class User {
    // Attributes
    private String name;
    private int unreadMessages;

    // Constructor
    public User(String name) {
        this.name = name;
        this.unreadMessages = 0;
    }

    // Method to greet user
    public void greet() {
        Log.i("Greeting", "Hello " + name + "!");
    }
}
