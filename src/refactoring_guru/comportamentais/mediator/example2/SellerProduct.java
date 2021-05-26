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
public class SellerProduct {
    public String id;
    public String name;
    public double price;

    public SellerProduct(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public SellerProduct() {}
}
