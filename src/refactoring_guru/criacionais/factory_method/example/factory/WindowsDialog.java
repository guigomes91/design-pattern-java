package refactoring_guru.criacionais.factory_method.example.factory;

import refactoring_guru.criacionais.factory_method.example.buttons.Button;
import refactoring_guru.criacionais.factory_method.example.buttons.WindowsButton;

/**
 *
 * @author Guilherme Gomes
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
