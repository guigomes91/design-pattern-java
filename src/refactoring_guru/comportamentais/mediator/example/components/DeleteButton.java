/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.mediator.example.components;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import refactoring_guru.comportamentais.mediator.example.mediator.Mediator;

/**
 *
 * @author Guilherme Gomes
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
