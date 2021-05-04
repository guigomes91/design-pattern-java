package refactoring_guru.criacionais.abstract_factory;

import java.util.Random;
import refactoring_guru.criacionais.abstract_factory.app.Application;
import refactoring_guru.criacionais.abstract_factory.factories.HelloWorldFactory;
import refactoring_guru.criacionais.abstract_factory.factories.HelloWorldFileFactory;
import refactoring_guru.criacionais.abstract_factory.factories.HelloWorldScreenFactory;

/**
 *
 * @author Guilherme Gomes
 */
public class Teste {
    static Random random = new Random(70);
    
    private static Application configure() {
        Application app;
        HelloWorldFactory factory;
        
        if(random.nextInt() < 50) {
            factory = new HelloWorldScreenFactory();
            app = new Application(factory);
        } else {
            factory = new HelloWorldFileFactory();
            app = new Application(factory);
        }
        
        return app;
    }
    
    public static void main(String[] args) {
        Application app = configure();
        app.imprimir();
    }
}
