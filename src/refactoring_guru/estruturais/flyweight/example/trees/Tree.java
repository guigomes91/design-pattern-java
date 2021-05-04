package refactoring_guru.estruturais.flyweight.example.trees;

import java.awt.*;

/**
 *
 * @author Guilherme Gomes
 * Contém estado único para cada árvore
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
