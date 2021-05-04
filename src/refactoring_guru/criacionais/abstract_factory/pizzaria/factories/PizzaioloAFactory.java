package refactoring_guru.criacionais.abstract_factory.pizzaria.factories;

import refactoring_guru.criacionais.abstract_factory.pizzaria.pizzaiolo.PizzaioloA;

/**
 *
 * @author Guilherme Gomes
 */
public class PizzaioloAFactory implements PizzariaFactory {

    @Override
    public Pizza fazerPizza() {
        return new PizzaioloA();
    }
    
}
