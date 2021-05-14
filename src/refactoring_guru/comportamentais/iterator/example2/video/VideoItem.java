/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.iterator.example2.video;

/**
 *
 * @author Guilherme Gomes
 */
public class VideoItem {
    public String nome;
    public double preco;
    
    public VideoItem(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
