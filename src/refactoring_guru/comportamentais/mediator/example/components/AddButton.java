/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.mediator.example.components;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import refactoring_guru.comportamentais.mediator.example.mediator.Mediator;
import refactoring_guru.comportamentais.mediator.example.mediator.Note;

/**
 *
 * @author Guilherme Gomes
  * Concrete components don't talk with each other. They have only one
  * communication channel–sending requests to the mediator.
 */
public class AddButton extends JButton implements Component {

    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
    
}
