package refactoring_guru.criacionais.factory_method.example.factory;

import refactoring_guru.criacionais.factory_method.example.buttons.Button;
import refactoring_guru.criacionais.factory_method.example.buttons.HtmlButton;

/**
 *
 * @author Guilherme Gomes
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
    
}
