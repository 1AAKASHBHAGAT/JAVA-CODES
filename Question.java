class BankAccount{
  private double balance;
   // setter 
   void setBalance (double balance) {
   if (balance < 0)
     System.out.println("Invalid balance. Please enter a valid balance.");
   else
     this.balance = balance;
   }
   // getter
   double getBalance() {
     return balance;
   }

}
//que.create BankAccount class a. private member balance b. setter to set member value c. getter to get member value 
public class Question {
  public static void main(String[] args) {
    // account.setBalance(1000); // This will cause a compilation error because the setter method is not implemented in the BankAccount class
    // System.out.println(account.getBalance()); // This will also cause a compilation error because the getter method is not implemented in the BankAccount class
  BankAccount b1 = new BankAccount();
  b1.setBalance(1000); 
  // This will cause a compilation error because the setter method is not implemented in the BankAccount class
    System.out.println(b1.getBalance()); // This will also cause a compilation error because the getter method is not implemented in the BankAccount class
  }
}
