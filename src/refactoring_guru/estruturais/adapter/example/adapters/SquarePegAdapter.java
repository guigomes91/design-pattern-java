package refactoring_guru.estruturais.adapter.example.adapters;

import refactoring_guru.estruturais.adapter.example.round.RoundPeg;
import refactoring_guru.estruturais.adapter.example.square.SquarePeg;

/**
 *
 * @author Guilherme Gomes
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;
    
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
