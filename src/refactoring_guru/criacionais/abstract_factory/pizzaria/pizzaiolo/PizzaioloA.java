package refactoring_guru.criacionais.abstract_factory.pizzaria.pizzaiolo;

import refactoring_guru.criacionais.abstract_factory.pizzaria.factories.Pizza;

/**
 *
 * @author Guilherme Gomes
 */
public class PizzaioloA implements Pizza {

    @Override
    public void fazerPizza() {
        System.out.println("Pizza de: (Queijo, Calabresa e Tomate)");
    }
    
}
