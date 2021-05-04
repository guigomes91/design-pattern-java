package refactoring_guru.criacionais.factory_method.exerc2;

/**
 *
 * @author Guilherme Gomes
 */
public class ProvedorFactory {

    public static Provedor createFile(String senha) {
        if (senha.equals("designpatterns")) {
            return new ArquivoConfidencial();
        }

        if (senha.equals("")) {
            return new ArquivoPublico();
        }

        throw new IllegalArgumentException("Valor passado inválido");
    }
}
