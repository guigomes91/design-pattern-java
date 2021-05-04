package refactoring_guru.criacionais.abstract_factory.screen;

import refactoring_guru.criacionais.abstract_factory.factories.HelloWorld;

/**
 *
 * @author Guilherme Gomes
 */
public class HelloWorldScreen implements HelloWorld {

    @Override
    public void mensagem() {
        System.out.println("Hello, World");
    }
    
}
