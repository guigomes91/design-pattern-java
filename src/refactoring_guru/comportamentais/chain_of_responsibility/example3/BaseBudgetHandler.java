package refactoring_guru.comportamentais.chain_of_responsibility.example3;

/**
 *
 * @author Guilherme Gomes
 */
public abstract class BaseBudgetHandler {
    
    protected BaseBudgetHandler nextHandler;
    
    public BaseBudgetHandler setNextHandler(BaseBudgetHandler handler) {
        this.nextHandler = handler;
        return handler;
    }
    
    public CustomerBudget handle(CustomerBudget budget) {
        if(this.nextHandler != null) {
            return this.nextHandler.handle(budget);
        }
        return budget;
    }
}
