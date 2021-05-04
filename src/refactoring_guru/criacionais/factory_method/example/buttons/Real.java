package refactoring_guru.criacionais.factory_method.example.buttons;

/**
 *
 * @author Guilherme Gomes
 */
public class Real implements Moeda {

    @Override
    public String getSimbolo() {
        return "R$";
    }
    
}
