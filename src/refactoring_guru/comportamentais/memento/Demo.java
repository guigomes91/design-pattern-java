package refactoring_guru.comportamentais.memento;

import refactoring_guru.comportamentais.memento.example.ImageEditor;
import refactoring_guru.comportamentais.memento.example.ImageEditorBackupManager;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor("/media/imagem.png", "png");
        ImageEditorBackupManager backupManager = new ImageEditorBackupManager(editor, 10);
        
        backupManager.backup();
        editor.convertFormatTo("gif");
        
        backupManager.backup();
        editor.convertFormatTo("bmp");
        
        backupManager.backup();
        editor.convertFormatTo("jpg");
        
        editor.show(); //jpg
        
        backupManager.undo();
        editor.show(); //bmp
        
        backupManager.undo();
        editor.show(); //gif
        
        backupManager.undo();
        editor.show(); //png
        
        backupManager.undo(); //no mementos
    }
}
