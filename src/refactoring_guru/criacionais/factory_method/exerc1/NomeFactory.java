package refactoring_guru.criacionais.factory_method.exerc1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Gomes
 */
public class NomeFactory {

    public static Nome criarNome(int type, String... nomes) {
        List<String> cv = new ArrayList<>();
        List<String> sv = new ArrayList<>();

        for (String n : nomes) {
            if (n.contains(",")) {
                cv.add(n);
            } else {
                sv.add(n);
            }
        }

        if (type == 0) {
            return new NomeComVirgula(cv);
        } 
        
        if (type == 1) {
            return new NomeSemVirgula(sv);
        }

        throw new IllegalArgumentException("");
    }
}
