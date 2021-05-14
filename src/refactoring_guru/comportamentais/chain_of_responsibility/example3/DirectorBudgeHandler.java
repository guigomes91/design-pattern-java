package refactoring_guru.comportamentais.chain_of_responsibility.example3;

/**
 *
 * @author Guilherme Gomes
 */
public class DirectorBudgeHandler extends BaseBudgetHandler {
    
    @Override
    public CustomerBudget handle(CustomerBudget budget) {
        if(budget.total <= 50000) {
            System.out.println("O diretor tratou o orçamento!");
            budget.approved = true;
            return budget;
        }
        
        return super.handle(budget);
    }
}
