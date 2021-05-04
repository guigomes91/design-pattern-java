package refactoring_guru.estruturais.flyweight.example.trees;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Guilherme Gomes
 * Encapsula a complexidade da criaçã flyweight das árvores 
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
