/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.observer.example.listeners;

import java.io.File;

/**
 *
 * @author Guilherme Gomes
 * Interface comum do observador
 */
public interface EventListener {
    void update(String eventType, File file);
}
