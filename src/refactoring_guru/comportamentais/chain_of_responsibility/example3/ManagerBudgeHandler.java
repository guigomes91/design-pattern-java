package refactoring_guru.comportamentais.chain_of_responsibility.example3;

/**
 *
 * @author Guilherme Gomes
 */
public class ManagerBudgeHandler extends BaseBudgetHandler {
    
    @Override
    public CustomerBudget handle(CustomerBudget budget) {
        if(budget.total <= 5000) {
            System.out.println("O manager tratou o orçamento!");
            budget.approved = true;
            return budget;
        }
        
        return super.handle(budget);
    }
}
