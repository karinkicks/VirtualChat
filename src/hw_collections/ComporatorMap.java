package hw_collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class ComporatorMap implements Comparator<String> {
    TreeMap<String, Integer> tree;
    public ComporatorMap(TreeMap<String, Integer> tree){
        this.tree=tree;
    }


    @Override
    public int compare(String o1, String o2) {
        return tree.get(o1) - tree.get(o2);
    }
}
