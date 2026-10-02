// overidding
class Payment{
    public void processpayment(double amount){
        System.out.println("Processing a generic payment of $"+amount);
    }
}
class Creditcard extends Payment{
    @Override 
    public void processpayment(double amount){
        System.out.println("Processing Credit Card payment of $" + amount + " (2% processing fee applied).");
    } 
}
class PayPal extends Payment{
    @Override
    public void processpayment(double amount){
        System.out.println("Processing PayPal payment of $" + amount + " (Redirecting to PayPal login...).");

    }
}
public class polymorphism {
    public static void main(String args[]){
        Payment p1=new Payment();
        p1.processpayment(50.0);
        Payment p2=new Creditcard();
        Payment p3=new PayPal();
        p2.processpayment(100.0);
        p3.processpayment(150);

    }
    
}
