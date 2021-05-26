/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.state.example;

import refactoring_guru.comportamentais.state.example.ui.Player;
import refactoring_guru.comportamentais.state.example.ui.UI;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
