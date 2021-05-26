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
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Seller seller1 = new Seller();
        List<SellerProduct> productsSeller1 = new ArrayList<>();
        productsSeller1.add(new SellerProduct("1", "Camiseta", 29.9));
        productsSeller1.add(new SellerProduct("2", "Caneta", 0.8));
        productsSeller1.add(new SellerProduct("3", "Lapis", 0.3));
        seller1.addProduct(productsSeller1);
        
        Seller seller2 = new Seller();
        List<SellerProduct> productsSeller2 = new ArrayList<>();
        productsSeller2.add(new SellerProduct("4", "Carro", 49000.9));
        productsSeller2.add(new SellerProduct("5", "Moto", 29999));
        productsSeller2.add(new SellerProduct("6", "Apagador", 3));
        seller2.addProduct(productsSeller2);
        
        List<Seller> sellers = new ArrayList<>();
        sellers.add(seller1);
        sellers.add(seller2);
        
        mediator.addSeller(sellers);
        
        Buyer buyer = new Buyer(mediator);
        buyer.viewProducts();
        buyer.buy("6");
        buyer.buy("4");
        buyer.viewProducts();
    }
}
