package refactoring_guru.estruturais.bridge.example.remote;

/**
 *
 * @author Guilherme Gomes
 * Interface comum para todos os controles remotos
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
