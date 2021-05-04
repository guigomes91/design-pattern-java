package refactoring_guru.estruturais.bridge.example.remote;

import refactoring_guru.estruturais.bridge.example.device.Device;

/**
 *
 * @author Guilherme Gomes
 */
public class AdvancedRemote extends BasicRemote {
    
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
