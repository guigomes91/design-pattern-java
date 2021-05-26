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
public class Mediator {

    private List<Seller> sellers = new ArrayList<>();

    public void addSeller(List<Seller> sellers) {
        sellers.forEach((seller) -> {
            this.sellers.add(seller);
        });
    }

    public SellerProduct buy(String id) {
        SellerProduct product = null;
        for (Seller seller : sellers) {
            product = seller.sell(id);

            if (product != null) {
                System.out.println("Aqui está " + product.id + ", "
                        + "name " + product.name + ", "
                        + "price " + product.price);
                seller.removeProduct(product);
                break;
            }
        }

        return product;
    }
    
    public void showProducts() {
        this.sellers.forEach((seller) -> {
            seller.showProducts();
        });
    }
}
