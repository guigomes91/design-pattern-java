package refactoring_guru.comportamentais.memento.example;

import java.util.Date;

/**
 *
 * @author Guilherme Gomes
 */
public class ConcreteMemento implements Memento {

    private String name;
    private Date date;
    private String filePath;
    private String fileFormat;
    
    public ConcreteMemento(String name, Date date, String filePath, String fileFormat) {
        this.name = name;
        this.date = date;
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Date getDate() {
        return this.date;
    }
    
    public String getFilePath() {
        return this.filePath;
    }
    
    public String getFileFormat() {
        return this.fileFormat;
    }
}
