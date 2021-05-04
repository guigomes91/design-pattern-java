package refactoring_guru.comportamentais.chain_of_responsibility.example2.processador;

/**
 *
 * @author Guilherme Gomes
 */
public abstract class Processor {

    private Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    public void process(Number request) {
        if (processor != null) {
            processor.process(request);
        }
    }
}
