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
public class AlertStateContext {

    private MobileAlertState currentState;

    public AlertStateContext() {
        currentState = new Vibration();
    }

    public void setState(MobileAlertState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert(this);
    }
}
