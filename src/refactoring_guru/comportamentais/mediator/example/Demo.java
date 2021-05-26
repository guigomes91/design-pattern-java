/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.mediator.example;

import javax.swing.DefaultListModel;
import refactoring_guru.comportamentais.mediator.example.components.AddButton;
import refactoring_guru.comportamentais.mediator.example.components.DeleteButton;
import refactoring_guru.comportamentais.mediator.example.components.Filter;
import refactoring_guru.comportamentais.mediator.example.components.List;
import refactoring_guru.comportamentais.mediator.example.components.SaveButton;
import refactoring_guru.comportamentais.mediator.example.components.TextBox;
import refactoring_guru.comportamentais.mediator.example.components.Title;
import refactoring_guru.comportamentais.mediator.example.mediator.Editor;
import refactoring_guru.comportamentais.mediator.example.mediator.Mediator;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
     public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
