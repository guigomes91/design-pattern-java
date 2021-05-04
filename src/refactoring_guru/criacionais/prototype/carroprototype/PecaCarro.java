package refactoring_guru.criacionais.prototype.carroprototype;

/**
 *
 * @author Guilherme Gomes
 */
public abstract class PecaCarro {
    
    public String motor;
    public String cambio;

    public PecaCarro() {
    }
    
    public PecaCarro(PecaCarro target) {
        this.motor = target.motor;
        this.cambio = target.cambio;
    }
    
    @Override
    public abstract PecaCarro clone();
}
