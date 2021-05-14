package refactoring_guru.comportamentais.chain_of_responsibility.example3;

/**
 *
 * @author Guilherme Gomes
 */
public class App {
    public static void main(String[] args) {
        CustomerBudget customer = new CustomerBudget();
        customer.total = 50001;
        
        SellerBudgeHandler seller = new SellerBudgeHandler();
        seller
                .setNextHandler(new ManagerBudgeHandler())
                .setNextHandler(new DirectorBudgeHandler())
                .setNextHandler(new CEOBudgeHandler());
        
        seller.handle(customer);
        System.out.println("Valor: " + customer.total + " Aprovou: " + customer.approved);
    }
}
