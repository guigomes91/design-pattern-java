/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring_guru.comportamentais.observer.example;

import refactoring_guru.comportamentais.observer.example.editor.Editor;
import refactoring_guru.comportamentais.observer.example.listeners.EmailNotificationListener;
import refactoring_guru.comportamentais.observer.example.listeners.LogOpenListener;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
        }
    }
}
