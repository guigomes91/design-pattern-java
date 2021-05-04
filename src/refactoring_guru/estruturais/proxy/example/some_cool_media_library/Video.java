package refactoring_guru.estruturais.proxy.example.some_cool_media_library;

/**
 *
 * @author Guilherme Gomes
 * Arquivo de vídeo
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
