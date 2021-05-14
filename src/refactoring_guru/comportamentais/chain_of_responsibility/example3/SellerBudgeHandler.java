package refactoring_guru.comportamentais.chain_of_responsibility.example3;

/**
 *
 * @author Guilherme Gomes
 */
public class SellerBudgeHandler extends BaseBudgetHandler {
    
    @Override
    public CustomerBudget handle(CustomerBudget budget) {
        if(budget.total <= 1000) {
            System.out.println("O vendedor tratou o orçamento!");
            budget.approved = true;
            return budget;
        }
        
        return super.handle(budget);
    }
}
