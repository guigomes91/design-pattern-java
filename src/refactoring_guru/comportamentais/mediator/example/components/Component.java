/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.mediator.example.components;

import refactoring_guru.comportamentais.mediator.example.mediator.Mediator;

/**
 *
 * @author Guilherme Gomes 
 * Common component interface.
 */
public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}
