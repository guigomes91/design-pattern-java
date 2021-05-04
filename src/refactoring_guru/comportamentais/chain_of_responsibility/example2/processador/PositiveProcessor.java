package refactoring_guru.comportamentais.chain_of_responsibility.example2.processador;

/**
 *
 * @author Guilherme Gomes
 */
public class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
