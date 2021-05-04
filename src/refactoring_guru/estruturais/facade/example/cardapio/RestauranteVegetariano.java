package refactoring_guru.estruturais.facade.example.cardapio;

/**
 *
 * @author Guilherme Gomes
 */
public class RestauranteVegetariano implements Cardapio {

    private String nome;

    public RestauranteVegetariano(String nome) {
        this.nome = nome;
    }
    
    @Override
    public Menu exibirMenu() {
        System.out.println("Restaurante: " + nome);
        return new MenuRestauranteVegetariano("Saladas", "15,99");
    }
    
}
