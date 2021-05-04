package refactoring_guru.estruturais.proxy.example.some_cool_media_library;

import java.util.HashMap;

/**
 *
 * @author Guilherme Gomes
 * Interface do serviço remoto
 */
public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();
    
    Video getVideo(String videoId);
}
