package refactoring_guru.estruturais.flyweight.example.forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import refactoring_guru.estruturais.flyweight.example.trees.Tree;
import refactoring_guru.estruturais.flyweight.example.trees.TreeFactory;
import refactoring_guru.estruturais.flyweight.example.trees.TreeType;

/**
 *
 * @author Guilherme Gomes
 * Floresta, que desenhamos
 */
public class Forest extends JFrame {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        trees.forEach((tree) -> {
            tree.draw(graphics);
        });
    }
}
