package refactoring_guru.comportamentais.command.example.commands;

import java.util.Stack;

/**
 *
 * @author Guilherme Gomes
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
