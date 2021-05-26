package refactoring_guru.comportamentais.memento.example;

import java.util.Date;

/**
 *
 * @author Guilherme Gomes
 * Originator
 */
public class ImageEditor {
    private String filePath;
    private String fileFormat;

    public ImageEditor(String filePath, String fileFormat) {
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }
    
    public void convertFormatTo(String format) {
        System.out.println("Valor informado: " + this.filePath + "\n");
        this.fileFormat = format;

        this.filePath = this.filePath.substring(0, this.filePath.length() - 4);
        this.filePath += "." + format;
    }
    
    public Memento save() {
        Date date = new Date(System.currentTimeMillis());
        return new ConcreteMemento(this.getClass().getName(), date, this.filePath, this.fileFormat);
    }
    
    public void restore(Memento memento) {
        ConcreteMemento concreteMemento = (ConcreteMemento) memento;
        this.filePath = concreteMemento.getFilePath();
        this.fileFormat = concreteMemento.getFileFormat();
    }
    
    public void show() {
        System.out.println("Convertido para: " + this.filePath);
    }
}
