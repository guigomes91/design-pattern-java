package refactoring_guru.estruturais.facade.example.some_complex_media_library;

import java.io.File;

/**
 *
 * @author Guilherme Gomes
 */
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
