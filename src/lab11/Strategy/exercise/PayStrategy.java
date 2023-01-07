package lab11.Strategy.exercise;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
