package refactoring_guru.estruturais.proxy.example2.internet;

import refactoring_guru.estruturais.proxy.example2.internet.Internet;

/**
 *
 * @author Guilherme Gomes
 */
public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to " + serverHost);
    }
    
}
