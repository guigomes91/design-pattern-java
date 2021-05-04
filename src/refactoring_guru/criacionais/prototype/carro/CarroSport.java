package refactoring_guru.criacionais.prototype.carro;

import refactoring_guru.criacionais.prototype.carroprototype.PecaCarro;

/**
 *
 * @author Guilherme Gomes
 */
public class CarroSport extends PecaCarro {

    public String cor;

    public CarroSport() {}
    
    public CarroSport(CarroSport sport) {
        super(sport);
        if(sport != null) {
            this.cor = sport.cor;
        }
    }
    
    @Override
    public PecaCarro clone() {
        return new CarroSport(this);
    }
    
}
