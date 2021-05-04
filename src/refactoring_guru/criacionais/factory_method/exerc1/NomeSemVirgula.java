package refactoring_guru.criacionais.factory_method.exerc1;

import java.util.List;

/**
 *
 * @author Guilherme Gomes
 */
public class NomeSemVirgula implements Nome {

    private String nome, sobrenome;
    List<String> lista = null;

    public NomeSemVirgula(List<String> lista) {
        this.lista = lista;
    }

    @Override
    public void criarNome() {
        for (String str : lista) {
            String[] separator = str.split(" ");
            
            nome = separator[0];
            sobrenome = separator[1];

            System.out.println(nome + " " + sobrenome);
        }
    }
}
