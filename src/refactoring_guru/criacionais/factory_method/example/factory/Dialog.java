package refactoring_guru.criacionais.factory_method.example.factory;

import refactoring_guru.criacionais.factory_method.example.buttons.Button;

/**
 *
 * @author Guilherme Gomes
 */
public abstract class Dialog {
    
    public void renderWindow() {
        // ... other code ...
        
        Button okButton = createButton();
        okButton.render();
    }
    
    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     * @return 
     */
    public abstract Button createButton();
}
