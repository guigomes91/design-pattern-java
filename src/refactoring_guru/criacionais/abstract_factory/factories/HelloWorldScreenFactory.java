package refactoring_guru.criacionais.abstract_factory.factories;

import refactoring_guru.criacionais.abstract_factory.screen.HelloWorldScreen;

/**
 *
 * @author Guilherme Gomes
 */
public class HelloWorldScreenFactory implements HelloWorldFactory {

    @Override
    public HelloWorld criarMensagem() {
        return new HelloWorldScreen();
    }
    
}
