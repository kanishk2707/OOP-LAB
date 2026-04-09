
class Calculator {

  
    public int add(int a, int b) {
        return a + b;
    }

  
    protected void display() {
        System.out.println("This is Calculator display method");
    }

  
    private void show() {
        System.out.println("This is private show() method of Calculator");
    }

   
    public void accessPrivate() {
        show();
    }
}


class AdvancedCalculator extends Calculator {


  
    public int add(int a, int b) {
        System.out.println("Advanced addition:");
        return a + b + 10; // modified behavior
    }

   
    
    protected void display() {
        System.out.println("This is AdvancedCalculator display method");
    }

   
    public void show() {
        System.out.println("This is show() method of AdvancedCalculator");
    }
}


public class Calcu {
    public static void main(String[] args) {

        
        Calculator c = new Calculator();
        System.out.println("Calculator add: " + c.add(5, 3));
        c.display();
        c.accessPrivate();

       

        
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("AdvancedCalculator add: " + ac.add(5, 3));
        ac.display();
        ac.show(); // child class method

        

       
        Calculator b = new AdvancedCalculator();

        System.out.println("Using parent reference:");
        System.out.println("Add: " + b.add(5, 3)); 
        b.display(); 
        b.accessPrivate();
    }
}