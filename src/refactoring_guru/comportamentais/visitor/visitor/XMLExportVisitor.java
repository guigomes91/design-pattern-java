package refactoring_guru.comportamentais.visitor.visitor;

import refactoring_guru.comportamentais.visitor.shapes.Circle;
import refactoring_guru.comportamentais.visitor.shapes.CompoundShape;
import refactoring_guru.comportamentais.visitor.shapes.Dot;
import refactoring_guru.comportamentais.visitor.shapes.Rectangle;
import refactoring_guru.comportamentais.visitor.shapes.Shape;

/**
 *
 * @author Guilherme Gomes
 */
public class XMLExportVisitor implements Visitor {
    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Shape shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDot(Dot d) {
        return "<dot>" + "\n" +
                "    <id>" + d.getId() + "</id>" + "\n" +
                "    <x>" + d.getX() + "</x>" + "\n" +
                "    <y>" + d.getY() + "</y>" + "\n" +
                "</dot>";
    }

    @Override
    public String visitCircle(Circle c) {
        return "<circle>" + "\n" +
                "    <id>" + c.getId() + "</id>" + "\n" +
                "    <x>" + c.getX() + "</x>" + "\n" +
                "    <y>" + c.getY() + "</y>" + "\n" +
                "    <radius>" + c.getRadius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle r) {
        return "<rectangle>" + "\n" +
                "    <id>" + r.getId() + "</id>" + "\n" +
                "    <x>" + r.getX() + "</x>" + "\n" +
                "    <y>" + r.getY() + "</y>" + "\n" +
                "    <width>" + r.getWidth() + "</width>" + "\n" +
                "    <height>" + r.getHeight() + "</height>" + "\n" +
                "</rectangle>";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.getId() + "</id>" + "\n" +
                _visitCompoundGraphic(cg) +
                "</compound_graphic>";
    }

    private String _visitCompoundGraphic(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        cg.children.stream().map((shape) -> shape.accept(this)).map((obj) -> "    " + obj.replace("\n", "\n    ") + "\n").forEachOrdered((obj) -> {
            // Proper indentation for sub-objects.
            sb.append(obj);
        });
        return sb.toString();
    }
}
