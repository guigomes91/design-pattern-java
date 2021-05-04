package refactoring_guru.estruturais.facade.example.cardapio;

/**
 *
 * @author Guilherme Gomes
 */
public class RestauranteNormal implements Cardapio {

    private String nome;

    public RestauranteNormal(String nome) {
        this.nome = nome;
    }
    
    @Override
    public Menu exibirMenu() {
        System.out.println("Restaurante: " + nome);
        return new MenuRestauranteNormal("Diversos Pratos", "19,99");
    }
    
}
