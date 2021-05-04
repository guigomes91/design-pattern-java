package refactoring_guru.criacionais.abstract_factory.pizzaria.factories;

import refactoring_guru.criacionais.abstract_factory.pizzaria.pizzaiolo.PizzaioloB;

/**
 *
 * @author Guilherme Gomes
 */
public class PizzaioloBFactory implements PizzariaFactory {

    @Override
    public Pizza fazerPizza() {
        return new PizzaioloB();
    }
    
}
