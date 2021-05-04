package refactoring_guru.estruturais.decorator.example2;

/**
 *
 * @author Guilherme Gomes
 */
public class CasaSimples implements Casa {

    private int qtdPorta;
    private String cor;

    public CasaSimples(int qtdPorta, String cor) {
        this.qtdPorta = qtdPorta;
        this.cor = cor;
    }
    
    @Override
    public void build() {
        System.out.println("Portas: " + qtdPorta + ", cor: " + cor);
    }

    @Override
    public String material() {
        return "Tijolo baiano";
    }
    
}
