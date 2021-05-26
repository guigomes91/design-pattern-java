/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.mediator.example2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Gomes
 */
public class Seller {

    private List<SellerProduct> products = new ArrayList<>();
    private Mediator mediator;
    
    public void showProducts() {
        products.forEach((product) -> {
            System.out.println("Product -> " + product.name + ", Price -> " + product.price);
        });
    }

    public void addProduct(List<SellerProduct> products) {
        products.forEach((product) -> {
            this.products.add(product);
        });
    }
    
    public void removeProduct(SellerProduct product) {
        this.products.remove(product);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }    
    
    public SellerProduct sell(String id) {
        SellerProduct productIndex = null;
        
        for(SellerProduct product : products) {
            if(product.id.equals(id)) {
                productIndex = product;
            }
        }
        
        return productIndex;
    }
}
