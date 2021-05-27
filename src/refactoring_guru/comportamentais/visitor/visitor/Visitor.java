package refactoring_guru.comportamentais.visitor.visitor;

import refactoring_guru.comportamentais.visitor.shapes.Circle;
import refactoring_guru.comportamentais.visitor.shapes.CompoundShape;
import refactoring_guru.comportamentais.visitor.shapes.Dot;
import refactoring_guru.comportamentais.visitor.shapes.Rectangle;

/**
 *
 * @author Guilherme Gomes
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
