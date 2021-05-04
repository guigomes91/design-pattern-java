package refactoring_guru.criacionais.factory_method.exerc2;

/**
 *
 * @author Guilherme Gomes
 */
public class Test {
    
    public static void main(String[] args) {
        Provedor info = ProvedorFactory.createFile("designpatterns");
        
        System.out.println(info.getInformacao());
    }   
}
