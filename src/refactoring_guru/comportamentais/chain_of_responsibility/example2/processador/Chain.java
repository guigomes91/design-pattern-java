package refactoring_guru.comportamentais.chain_of_responsibility.example2.processador;

/**
 *
 * @author Guilherme Gomes
 */
public class Chain {

    Processor chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }

    public void process(Number request) {
        chain.process(request);
    }
}
