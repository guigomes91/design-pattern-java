package refactoring_guru.criacionais.builder.patternburgers.builders;

import java.util.HashSet;
import java.util.Set;
import refactoring_guru.criacionais.builder.patternburgers.cliente.Cliente;

/**
 *
 * @author Guilherme Gomes
 */
public class AtendenteBuilder {
    private final Cliente cliente;
    Set<String> item = new HashSet<>();

    public AtendenteBuilder(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void adicionaItem(String it) {
        item.add(it);
    }
    
    public FuncionarioBuilder getResult() {
        System.out.println("Pedido para o cliente " + cliente.getNome() + "\n\n");
        return new FuncionarioBuilder(item);
    }
    
}
