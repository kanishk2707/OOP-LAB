class Notifier {

    // public method
    public void send(String message) {
        System.out.println("General Notification: " + message);
    }

    // protected method
    protected void send(String message, String email) {
        System.out.println("Email Notification to " + email + ": " + message);
    }

    // default (no modifier)
    void send(String message, long phone) {
        System.out.println("SMS to " + phone + ": " + message);
    }

    // private method
    private void sendInternal(String message) {
        System.out.println("Internal Notification: " + message);
    }

    // public method to access private method
    public void accessPrivate(String message) {
        sendInternal(message);
    }
}

// Subclass
class AppNotifier extends Notifier {
    public void testMethods() {

        // accessing inherited methods
        send("Hello User");                          // public
        send("Check Email", "user@gmail.com");       // protected
        send("OTP", 9876543210L);                   // default

        // ❌ cannot call private method directly
        // sendInternal("Test");  // ERROR

        // accessing private method indirectly
        accessPrivate("System Update");
    }
}

public class Notification {
    public static void main(String[] args) {

        AppNotifier app = new AppNotifier();

        // Method Overloading (compile-time polymorphism)
        app.send("Welcome!");
        app.send("Login Alert", "user@gmail.com");
        app.send("OTP Code", 9876543210L);

        System.out.println("---- From Subclass ----");
        app.testMethods();
    }
}