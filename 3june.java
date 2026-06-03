// File name: Main.java

// 1. THE INTERFACE: Defines a strict contract for electronic payments
interface ElectronicPayment {
    // Abstract method (implicitly public and abstract)
    void printReceipt(); 
}

// 2. THE ABSTRACT CLASS: Defines a template for all Payment types
abstract class Payment {
    // Hidden data (Encapsulation working with Abstraction)
    private double amount;

    // Constructor to initialize the shared data
    public Payment(double amount) {
        this.amount = amount;
    }

    // Concrete method: All payments calculate tax the exact same way
    public double calculateTax() {
        return this.amount * 0.05; // 5% flat tax
    }

    // Abstract method: Every payment method processes money differently
    public abstract void processPayment();

    // Getter to allow subclasses to read the private amount
    public double getAmount() {
        return amount;
    }
}

// 3. CONCRETE SUBCLASS 1: Credit Card implementation
class CreditCardPayment extends Payment implements ElectronicPayment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount); // Pass amount to the parent constructor
        this.cardNumber = cardNumber;
    }

    // Implementing the abstract method from Payment class
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + getAmount());
        System.out.println("Validating card number: " + cardNumber);
        System.out.println("Charging card... Success!");
    }

    // Implementing the abstract method from ElectronicPayment interface
    @Override
    public void printReceipt() {
        System.out.println("Receipt emailed for Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

// 4. CONCRETE SUBCLASS 2: Cash implementation (No receipt needed)
class CashPayment extends Payment {
    
    public CashPayment(double amount) {
        super(amount);
    }

    // Implementing the abstract method from Payment class
    @Override
    public void processPayment() {
        System.out.println("Processing cash payment of $" + getAmount());
        System.out.println("Opening cash drawer... Money received.");
    }
}

// 5. THE MAIN CLASS: Demonstrating Abstraction to the student
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Scenario 1: Credit Card ---");
        // Abstract reference pointing to concrete object
        Payment cardPayment = new CreditCardPayment(150.00, "1234-5678-9876-5432");
        cardPayment.processPayment(); 
        System.out.println("Tax added: $" + cardPayment.calculateTax());
        
        // Casting to interface to trigger electronic features
        ElectronicPayment emailReceipt = (ElectronicPayment) cardPayment;
        emailReceipt.printReceipt();

        System.out.println("\n--- Scenario 2: Cash ---");
        Payment cashPayment = new CashPayment(45.50);
        cashPayment.processPayment();
        System.out.println("Tax added: $" + cashPayment.calculateTax());
    }
}
