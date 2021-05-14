/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.iterator.example2.iterator;

import refactoring_guru.comportamentais.iterator.example2.video.VideoItem;

/**
 *
 * @author Guilherme Gomes
 */
public class VideoIterator implements Iterator {

    VideoItem[] itens;
    int posicao = 0;

    public VideoIterator(VideoItem[] itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        return !(posicao >= itens.length || itens[posicao] == null);
    }

    @Override
    public Object next() {
        VideoItem videoItem = itens[posicao];
        posicao++;
        return videoItem;
    }

}
