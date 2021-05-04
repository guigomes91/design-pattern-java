package refactoring_guru.estruturais.adapter.example;

import refactoring_guru.estruturais.adapter.example.adapters.TomadaBAdapter;
import refactoring_guru.estruturais.adapter.example.monofasico.TomadaA;
import refactoring_guru.estruturais.adapter.example.monofasico.TomadaMonofasica;
import refactoring_guru.estruturais.adapter.example.trifasico.TomadaB;

/**
 *
 * @author Guilherme Gomes
 */
public class Test {
    public static void main(String[] args) {
        TomadaMonofasica tm = new TomadaMonofasica(115);
        TomadaA ta = new TomadaA();
        
        TomadaB b = new TomadaB();
        
        TomadaBAdapter tb = new TomadaBAdapter(b);
        
        System.out.println("Tomada A");
        tm.encaixeTomada(ta);
        System.out.println("\nTomada B");
        tm.encaixeTomada(tb);
    }
}
