package refactoring_guru.criacionais.abstract_factory.factories;

import refactoring_guru.criacionais.abstract_factory.file.HelloWorldFile;

/**
 *
 * @author Guilherme Gomes
 */
public class HelloWorldFileFactory implements HelloWorldFactory {

    @Override
    public HelloWorld criarMensagem() {
        return new HelloWorldFile();
    }
    
}
