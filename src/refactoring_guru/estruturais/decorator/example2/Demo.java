package refactoring_guru.estruturais.decorator.example2;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    
    public static void main(String[] args) {
        CasaDecorator dec = new CasaDecorator(new CasaSimples(3, "Azul"));
        dec.build();
    }
}
