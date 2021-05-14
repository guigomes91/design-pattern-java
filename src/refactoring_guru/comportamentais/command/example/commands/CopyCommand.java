package refactoring_guru.comportamentais.command.example.commands;

import refactoring_guru.comportamentais.command.example.editor.Editor;

/**
 *
 * @author Guilherme Gomes
 */
public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
