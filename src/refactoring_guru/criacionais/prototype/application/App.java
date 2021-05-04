package refactoring_guru.criacionais.prototype.application;

import refactoring_guru.criacionais.prototype.carro.CarroBasic;
import refactoring_guru.criacionais.prototype.carro.CarroSport;

/**
 *
 * @author Guilherme Gomes
 */
public class App {
    
    public void clonarCarroSport() {
        CarroSport sport = new CarroSport();
        
        sport.cambio = "Automatico";
        sport.cor = "Vermelho";
        sport.motor = "V8";
        
        CarroSport otherSport = (CarroSport) sport.clone();
        
        System.out.println("Carro Sport 1");
        System.out.println("Cambio: " + sport.cambio);
        System.out.println("Cor: " + sport.cor);
        System.out.println("Motor: " + sport.motor + "\n");
        
        System.out.println("Carro Sport 2");
        System.out.println("Cambio: " + otherSport.cambio);
        System.out.println("Cor: " + otherSport.cor);
        System.out.println("Motor: " + otherSport.motor + "\n");
    }
    
    public void clonarCarroBasic() {
        CarroBasic basic = new CarroBasic();
        
        basic.cambio = "Automatico";
        basic.ano = "2020";
        basic.motor = "V8";
        
        CarroBasic otherBasic = (CarroBasic) basic.clone();
        
        System.out.println("Carro Basic 1");
        System.out.println("Cambio: " + basic.cambio);
        System.out.println("Cor: " + basic.ano);
        System.out.println("Motor: " + basic.motor + "\n");
        
        System.out.println("Carro Basic 2");
        System.out.println("Cambio: " + otherBasic.cambio);
        System.out.println("Cor: " + otherBasic.ano);
        System.out.println("Motor: " + otherBasic.motor + "\n");
    }
}
