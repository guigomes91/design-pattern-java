package refactoring_guru.criacionais.builder.patternburgers.builders;

import java.util.HashSet;
import java.util.Set;
import refactoring_guru.criacionais.builder.patternburgers.pedido.Pedido;

/**
 *
 * @author Guilherme Gomes
 */
public class FuncionarioBuilder {
    private Set<String> item;
    private Set<String> dentroDaCaixa = new HashSet<String>();
    private Set<String> foraDaCaixa = new HashSet<String>();

    public FuncionarioBuilder(Set<String> item) {
        this.item = item;
    }
    
    private void setDentroDaCaixa(String item) {
        dentroDaCaixa.add(item);
    }
    
    private void setForaDaCaixa(String item) {
        foraDaCaixa.add(item);
    }
    
    public Pedido getResult() {
        for(String it : item) {
            if(it.equals("hamburguer") 
                    || it.equals("cheeseburger") || 
                                it.equals("pequena") || 
                                        it.equals("media") || 
                                            it.equals("grande") ||
                                                it.equals("carrinho") || 
                                                        it.equals("bonequinha")) {
                setDentroDaCaixa(it);
            } else {
                setForaDaCaixa(it);
            }
        }
        return new Pedido(dentroDaCaixa, foraDaCaixa);
    }
}
