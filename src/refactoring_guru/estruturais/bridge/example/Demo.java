package refactoring_guru.estruturais.bridge.example;

import refactoring_guru.estruturais.bridge.example.device.Device;
import refactoring_guru.estruturais.bridge.example.device.Radio;
import refactoring_guru.estruturais.bridge.example.device.Tv;
import refactoring_guru.estruturais.bridge.example.remote.AdvancedRemote;
import refactoring_guru.estruturais.bridge.example.remote.BasicRemote;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
