package refactoring_guru.criacionais.factory_method.example;

import refactoring_guru.criacionais.factory_method.example.buttons.Moeda;
import refactoring_guru.criacionais.factory_method.example.factory.MoedaFactory;
import refactoring_guru.criacionais.factory_method.example.factory.Pais;

/**
 *
 * @author Guilherme Gomes
 */
public class TestMoeda {
    
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        System.out.println(moeda.getSimbolo());
    }
    
}
