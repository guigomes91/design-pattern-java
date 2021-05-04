package refactoring_guru.criacionais.builder.patternburgers;

import refactoring_guru.criacionais.builder.patternburgers.builders.AtendenteBuilder;
import refactoring_guru.criacionais.builder.patternburgers.builders.FuncionarioBuilder;
import refactoring_guru.criacionais.builder.patternburgers.cliente.Cliente;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setCodigo("1");
        c.setNome("Guilherme");
        
        AtendenteBuilder atBuilder = new AtendenteBuilder(c);
        
        atBuilder.adicionaItem("hamburguer");
        atBuilder.adicionaItem("pequena");
        atBuilder.adicionaItem("carrinho");
        atBuilder.adicionaItem("coca");
        
        FuncionarioBuilder fnBuilder = atBuilder.getResult();
        
        System.out.println(fnBuilder.getResult().toString());
    }
}
