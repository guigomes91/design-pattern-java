package refactoring_guru.estruturais.facade.example.cardapio;

/**
 *
 * @author Guilherme Gomes
 */
public class RestauranteAmbos implements Cardapio {

    private String nome;

    public RestauranteAmbos(String nome) {
        this.nome = nome;
    }
    
    @Override
    public Menu exibirMenu() {
        System.out.println("Restaurante: " + nome);
        return new MenuRestauranteAmbos("Prime", "25,99");
    }
    
}
