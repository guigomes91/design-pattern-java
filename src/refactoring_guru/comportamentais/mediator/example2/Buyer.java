/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.mediator.example2;

/**
 *
 * @author Guilherme Gomes
 */
public class Buyer {
    private final Mediator mediator;

    public Buyer(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public void viewProducts() {
        this.mediator.showProducts();
    }
    
    public void buy(String id) {
        this.mediator.buy(id);
    }
}
