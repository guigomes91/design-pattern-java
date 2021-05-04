package refactoring_guru.criacionais.factory_method.exerc1;

/**
 *
 * @author Guilherme Gomes
 */
public class Test {
    public static void main(String[] args) {
        String[] nomes = {"Viviane Oliveira", "Gomes, Guilherme", "Melinda Gates", "Silva, Thiago", "Junior, Neymar"};
        
        Nome nomesSemVirgula = NomeFactory.criarNome(0, nomes);
        Nome nomesComVirgula = NomeFactory.criarNome(1, nomes);
        
        nomesSemVirgula.criarNome();
        nomesComVirgula.criarNome();
    }
}
