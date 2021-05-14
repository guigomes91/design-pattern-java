package refactoring_guru.comportamentais.chain_of_responsibility.example3;

/**
 *
 * @author Guilherme Gomes
 */
public class CEOBudgeHandler extends BaseBudgetHandler {

    @Override
    public CustomerBudget handle(CustomerBudget budget) {
        System.out.println("O CEO trata qualquer orçamento!");
        budget.approved = true;
        return budget;
    }
}
