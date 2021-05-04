package refactoring_guru.estruturais.facade.example.cardapio;

/**
 *
 * @author Guilherme Gomes
 */
public class Menu implements Cardapio {
    private String prato;
    private String preco;

    public Menu(String prato, String preco) {
        this.prato = prato;
        this.preco = preco;
    }

    @Override
    public Menu exibirMenu() {
        System.out.println("Prato(" + prato + "), Preco(" + preco + ")");
        return new Menu(prato, preco);
    }
            
}
