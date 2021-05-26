package refactoring_guru.comportamentais.memento.example;

/**
 *
 * @author Guilherme Gomes
 */
public class ImageEditorBackupManager {
    private ImageEditor originator;
    private Memento[] mementos;
    private int i = 0;
    private int backupSize;

    public ImageEditorBackupManager(ImageEditor originator, int backupSize) {
        this.originator = originator;
        this.backupSize = backupSize;
        this.mementos = new Memento[backupSize];
    }
    
    public void backup() {
        System.out.println("Backup: salvando o estado de ImageEditor");
        this.mementos[i] = this.originator.save();
        i++;
    }
    
    public void undo() {
        if(i == 0) {
            System.out.println("Backup: no mementos");
            return;
        }
        
        Memento memento = this.mementos[i - 1];
        i--;
        
        this.originator.restore(memento);
        System.out.println("Backup: " + memento.getDate() + " foi restaurado com sucesso!");
    }
    
    public void showMementos() {
        for(int i = 0; i < this.backupSize; i++) {
            if(mementos[i] == null) {
                return;
            } else {
                System.out.println("Mementos " + mementos[i].getName());
            }
        }
    }
}
