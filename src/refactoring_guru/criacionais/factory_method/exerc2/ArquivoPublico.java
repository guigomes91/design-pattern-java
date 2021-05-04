package refactoring_guru.criacionais.factory_method.exerc2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme Gomes
 */
public class ArquivoPublico implements Provedor {

    byte[] encoded = null;
    
    @Override
    public String getInformacao() {
        try {
            encoded = Files.readAllBytes(Paths.get("C:/designpatterns/publico.txt"));
        } catch (IOException ex) {
            Logger.getLogger(ArquivoConfidencial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Charset.defaultCharset().decode(ByteBuffer.wrap(encoded)).toString();
    }
}
