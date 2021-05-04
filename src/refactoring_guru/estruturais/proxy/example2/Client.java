package refactoring_guru.estruturais.proxy.example2;

import refactoring_guru.estruturais.proxy.example2.internet.Internet;
import refactoring_guru.estruturais.proxy.example2.proxy.ProxyInternet;

/**
 *
 * @author Guilherme Gomes
 */
public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        
        try {
            internet.connectTo("java.com");
            internet.connectTo("abc.com");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
