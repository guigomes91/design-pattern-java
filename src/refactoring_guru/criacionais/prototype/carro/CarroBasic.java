package refactoring_guru.criacionais.prototype.carro;

import refactoring_guru.criacionais.prototype.carroprototype.PecaCarro;

/**
 *
 * @author Guilherme Gomes
 */
public class CarroBasic extends PecaCarro {

    public String ano;

    public CarroBasic() {}
    
    public CarroBasic(CarroBasic target) {
        super(target);
        if(target != null) {
            this.ano = target.ano;
        }
    }
    
    @Override
    public PecaCarro clone() {
        return new CarroBasic(this);
    }
    
}
