package refactoring_guru.estruturais.proxy.example2.proxy;

import java.util.ArrayList;
import java.util.List;
import refactoring_guru.estruturais.proxy.example2.internet.Internet;
import refactoring_guru.estruturais.proxy.example2.internet.RealInternet;

/**
 *
 * @author Guilherme Gomes
 */
public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;
    
    static {
        bannedSites = new ArrayList();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
    
    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        
        internet.connectTo(serverHost);
    }
    
}
