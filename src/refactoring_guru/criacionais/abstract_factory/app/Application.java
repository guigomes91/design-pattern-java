package refactoring_guru.criacionais.abstract_factory.app;

import refactoring_guru.criacionais.abstract_factory.factories.HelloWorld;
import refactoring_guru.criacionais.abstract_factory.factories.HelloWorldFactory;

/**
 *
 * @author Guilherme Gomes
 */
public class Application {
    
    private HelloWorld hw;

    public Application(HelloWorldFactory factory) {
        hw = factory.criarMensagem();
    }
    
    public void imprimir() {
        hw.mensagem();
    }
}
