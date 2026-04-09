interface Bank {
    void interestRate();
}

class SBI implements Bank {
    public void interestRate() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

class HDFC implements Bank {
    public void interestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class Bankac {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.interestRate();
        b2.interestRate();
    }
}