package refactoring_guru.criacionais.factory_method.example.buttons;

/**
 *
 * @author Guilherme Gomes
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

}
