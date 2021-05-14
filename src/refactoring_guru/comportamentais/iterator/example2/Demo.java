/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.iterator.example2;

import refactoring_guru.comportamentais.iterator.example2.iterator.Iterator;
import refactoring_guru.comportamentais.iterator.example2.iterator.VideoIterator;
import refactoring_guru.comportamentais.iterator.example2.video.VideoItem;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    public static void main(String[] args) {
        VideoItem[] videoItens = new VideoItem[4];
        
        videoItens[0] = new VideoItem("Home-Aranha", 2.5);
        videoItens[1] = new VideoItem("Casa do Lago", 1.5);
        videoItens[2] = new VideoItem("Agente 007", 4.5);
        videoItens[3] = new VideoItem("Anjos da Lei", 3.5);
        
        Iterator videoIterator = new VideoIterator(videoItens);
        
        while(videoIterator.hasNext()) {
            VideoItem videoItem = (VideoItem) videoIterator.next();
            System.out.println(videoItem.nome + " = R$ " + videoItem.preco);
        }
    }
}
