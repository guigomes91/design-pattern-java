package refactoring_guru.criacionais.abstract_factory.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import refactoring_guru.criacionais.abstract_factory.factories.HelloWorld;

/**
 *
 * @author Guilherme Gomes
 */
public class HelloWorldFile implements HelloWorld {

    @Override
    public void mensagem() {
        try {
            FileWriter fw = new FileWriter("C:\\designpatterns\\output.txt");
            PrintWriter pw = new PrintWriter(fw);
            
            pw.print("Hello, World");
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
