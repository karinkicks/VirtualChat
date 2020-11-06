package hw_collections;

import virtual_chat.VirtualChat;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap();
        tree.put("a",10);
        tree.put("b",5);
        tree.put("c",15);
        tree.put("d",1000);
        tree.put("e",-5);
        tree.put("f",115);
        ComporatorMap comporator = new ComporatorMap(tree);
        TreeMap<String, Integer> sorttree = new TreeMap(comporator);
        System.out.println(tree);
        sorttree.putAll(tree);
        System.out.println(sorttree);
        Convertator c = new Convertator();
        System.out.println(c.decimalDigitToRomanNumeral(999));
    }
}
