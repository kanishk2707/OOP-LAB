class Calculator {

    // public method
    public int add(int a, int b) {
        System.out.println("Parent class method");
        return a + b;
    }

    // protected method
    protected void display() {
        System.out.println("This is protected method in parent class");
    }

    // private method (cannot be overridden)
    private void show() {
        System.out.println("Private method in parent class");
    }

    // public method to access private method
    public void accessPrivate() {
        show();
    }
}

// Child class
class AdvancedCalculator extends Calculator {

    // overriding public method
    @Override
    public int add(int a, int b) {
        System.out.println("Child class overridden method");
        return a + b + 10;
    }

    // overriding protected method
    @Override
    public void display() {
        System.out.println("Protected method overridden in child class");
    }

    // This is NOT overriding (private method can't be overridden)
    public void show() {
        System.out.println("New method in child class (not overriding)");
    }
}

public class Adcal {
    public static void main(String[] args) {

        // Parent object
        Calculator obj1 = new Calculator();
        System.out.println("Parent add: " + obj1.add(2, 3));
        obj1.display();
        obj1.accessPrivate();

        System.out.println("------------");

        // Child object
        AdvancedCalculator obj2 = new AdvancedCalculator();
        System.out.println("Child add: " + obj2.add(2, 3));
        obj2.display();
        obj2.show();

        System.out.println("------------");

        // Runtime polymorphism
        Calculator ref = new AdvancedCalculator();
        System.out.println("Runtime polymorphism: " + ref.add(2, 3));
        ref.display();
    }
}