package refactoring_guru.estruturais.decorator.example2;

/**
 *
 * @author Guilherme Gomes
 */
public class CasaDecorator implements Casa {
    
    Casa casa;

    public CasaDecorator(Casa casa) {
        this.casa = casa;
    }
    
    @Override
    public void build() {
        System.out.println("Portas de vidro!");
        buildDecorator();
    }

    @Override
    public String material() {
        return "Pedra e Areia";
    }
    
    public void buildDecorator() {
        casa.build();
        System.out.println(material());
        System.out.println(casa.material());
    }
}
