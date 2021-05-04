package refactoring_guru.estruturais.decorator.example.decorators;

/**
 *
 * @author Guilherme Gomes
 *  Uma interface de dados comum, que define as operações ler e escrever
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
