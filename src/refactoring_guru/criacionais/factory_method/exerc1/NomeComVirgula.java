package refactoring_guru.criacionais.factory_method.exerc1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Gomes
 */
public class NomeComVirgula implements Nome {
    
    private String nome, sobrenome;
    List<String> lista = null;

    public NomeComVirgula(List<String> lista) {
        this.lista = lista;
    }
    
    @Override
    public void criarNome() {
        for(String str : lista) {
            String[] separator = str.split(",");
            
            nome = separator[1];
            sobrenome = separator[0];
            
            System.out.println(nome.trim() + " " + sobrenome.trim());
        }
    }
}
