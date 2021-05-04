package refactoring_guru.comportamentais.chain_of_responsibility.example2.processador;

/**
 *
 * @author Guilherme Gomes
 */
public class NegativeProcessor extends Processor {

    public NegativeProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
