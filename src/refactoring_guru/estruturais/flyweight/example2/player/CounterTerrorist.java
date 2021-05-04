package refactoring_guru.estruturais.flyweight.example2.player;

/**
 *
 * @author Guilherme Gomes CounterTerrorist must have weapon and mission
 */
public class CounterTerrorist implements Player {

    // Intrinsic Attribute
    private final String TASK;
    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist() {
        this.TASK = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }

}
