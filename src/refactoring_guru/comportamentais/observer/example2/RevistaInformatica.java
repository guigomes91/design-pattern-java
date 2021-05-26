/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.observer.example2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Guilherme Gomes
 */
public class RevistaInformatica extends Observable {

    private int edicao;

    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;

        setChanged();
        notifyObservers();
    }

    public int getEdicao() {
        return this.edicao;
    }

    public static void main(String[] args) {
        //poderia receber a nova edicao atraves de um recurso externo
        int novaEdicao = 3;
        RevistaInformatica revistaInformatica = new RevistaInformatica();
        Assinante1 assinante1 = new Assinante1(revistaInformatica);

        revistaInformatica.setNovaEdicao(novaEdicao);
    }

}

class Assinante1 implements Observer {

    Observable revistaInformatica;

    int edicaoNovaRevista;

    public Assinante1(Observable revistaInformatica) {
        this.revistaInformatica = revistaInformatica;
        revistaInformatica.addObserver(this);
    }

    @Override
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof RevistaInformatica) {
            RevistaInformatica revistaInformatica = (RevistaInformatica) revistaInfSubject;
            edicaoNovaRevista = revistaInformatica.getEdicao();
            System.out.println("Atenção, já chegou a mais uma edição da Revista Informatica. "
                    + "Esta é a sua edição número: " + edicaoNovaRevista);
        }
    }
}
