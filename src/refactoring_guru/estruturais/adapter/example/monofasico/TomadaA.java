package refactoring_guru.estruturais.adapter.example.monofasico;

/**
 *
 * @author Guilherme Gomes
 * Tomada modelo 3 pinos
 */
public class TomadaA {
    private int pino = 3;
    private String modelo = "BR";

    public TomadaA() {}
    
    public String getModelo() {
        return modelo;
    }

    public int getPino() {
        return pino;
    }
}
