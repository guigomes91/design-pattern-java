/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.iterator.example.iterators;

import refactoring_guru.comportamentais.iterator.example.profile.Profile;

/**
 *
 * @author Guilherme Gomes
 * Define interface de perfil
 */
public interface ProfileIterator {
    boolean hasNext();
    
    Profile getNext();
    
    void reset();
}
