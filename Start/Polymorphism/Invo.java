class InvoiceProcessor {

    // public method
    public void generateInvoice(String customer, double amount) {
        System.out.println("Invoice for " + customer);
        System.out.println("Amount: " + amount);
    }

    // protected method
    protected void displayType() {
        System.out.println("General Invoice");
    }

    // private method (cannot be overridden)
    private double calculateTax(double amount) {
        return amount * 0.1;
    }

    // public method to access private method
    public void showTotal(String customer, double amount) {
        double tax = calculateTax(amount);
        System.out.println("Total (with tax) for " + customer + ": " + (amount + tax));
    }
}

// Subclass
class RetailInvoice extends InvoiceProcessor {

    // overriding method
    @Override
    public void generateInvoice(String customer, double amount) {
        double discount = amount * 0.1;
        double finalAmount = amount - discount;

        System.out.println("Retail Invoice for " + customer);
        System.out.println("Original Amount: " + amount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    // overriding protected method
    @Override
    public void displayType() {
        System.out.println("Retail Invoice Type");
    }

    // NOT overriding (private methods can't be overridden)
    public double calculateTax(double amount) {
        return amount * 0.05;
    }
}

public class Invo {
    public static void main(String[] args) {

        // Parent reference → Child object (Runtime Polymorphism)
        InvoiceProcessor ref = new RetailInvoice();

        ref.generateInvoice("John", 1000);   // calls child method
        ref.displayType();                   // calls child method

        // accessing private method indirectly
        ref.showTotal("John", 1000);
    }
}