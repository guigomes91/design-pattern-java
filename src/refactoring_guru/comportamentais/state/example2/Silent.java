/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.state.example2;

/**
 *
 * @author Guilherme Gomes
 */
public class Silent implements MobileAlertState {

    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("silent...");
    }
}
