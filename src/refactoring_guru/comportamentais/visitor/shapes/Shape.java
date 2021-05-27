package refactoring_guru.comportamentais.visitor.shapes;

import refactoring_guru.comportamentais.visitor.visitor.Visitor;

/**
 *
 * @author Guilherme Gomes
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
