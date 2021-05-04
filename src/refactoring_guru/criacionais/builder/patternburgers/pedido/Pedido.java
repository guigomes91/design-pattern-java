package refactoring_guru.criacionais.builder.patternburgers.pedido;

import java.util.Set;

/**
 *
 * @author Guilherme Gomes
 */
public class Pedido {

    private Set<String> dentroDaCaixa;
    private Set<String> foraDaCaixa;

    public Pedido(Set<String> dentroDaCaixa, Set<String> foraDaCaixa) {
        this.dentroDaCaixa = dentroDaCaixa;
        this.foraDaCaixa = foraDaCaixa;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Seu pedido:\n");
        str.append("Dentro da caixa:\n");
        for (String item : dentroDaCaixa) {
            str.append("\t" + item + "\n");
        }
        str.append("Fora da Caixa:\n");
        for (String item : foraDaCaixa) {
            str.append("\t" + item + "\n");
        }
        str.append("\nTenha um bom dia!\n\n");

        return str.toString();
    }
}
