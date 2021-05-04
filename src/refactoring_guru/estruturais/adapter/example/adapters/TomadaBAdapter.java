package refactoring_guru.estruturais.adapter.example.adapters;

import refactoring_guru.estruturais.adapter.example.monofasico.TomadaA;
import refactoring_guru.estruturais.adapter.example.trifasico.TomadaB;

/**
 *
 * @author Guilherme Gomes
 */
public class TomadaBAdapter extends TomadaA {
    
    private final TomadaB tb;
    
    public TomadaBAdapter(TomadaB b) {
        this.tb = b;
    }

    @Override
    public int getPino() {
        return tb.getPino();
    }

    @Override
    public String getModelo() {
        return "EUA";
    }
    
    
}
