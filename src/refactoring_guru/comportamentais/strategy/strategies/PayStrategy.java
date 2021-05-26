package refactoring_guru.comportamentais.strategy.strategies;

/**
 *
 * @author Guilherme Gomes
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
