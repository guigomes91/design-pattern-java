package refactoring_guru.criacionais.abstract_factory.pizzaria.application;

import refactoring_guru.criacionais.abstract_factory.pizzaria.factories.Pizza;
import refactoring_guru.criacionais.abstract_factory.pizzaria.factories.PizzariaFactory;

/**
 *
 * @author Guilherme Gomes
 */
public class App {
    Pizza pz;

    public App(PizzariaFactory factory) {
        pz = factory.fazerPizza();
    }
    
    public void prepararPizza() {
        pz.fazerPizza();
    }
    
}
