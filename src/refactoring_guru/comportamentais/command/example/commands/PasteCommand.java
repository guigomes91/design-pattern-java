package refactoring_guru.comportamentais.command.example.commands;

import refactoring_guru.comportamentais.command.example.editor.Editor;

/**
 *
 * @author Guilherme Gomes
 */
public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
