package hw_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Convertator {
    private static final Map<Integer, String > map = new HashMap<>();
    static {
    map.put(1, "I");
    map.put(2, "II");
    map.put(3, "III");
    map.put(4, "IV");
    map.put(5, "V");
    map.put( 6, "VI");
    map.put(7, "VII");
    map.put( 8, "VIII");
    map.put( 9, "IX");
    map.put(10, "X");}

    public  String decimalDigitToRomanNumeral(Integer decimalDigit) {
        String romanNumeral = "";
        while (decimalDigit >= 1) {
            if (map.containsKey(decimalDigit % 10)) {
                romanNumeral = romanNumeral + map.get(decimalDigit % 10);
            } else {
                romanNumeral = romanNumeral + "_";
            }
            decimalDigit = (decimalDigit  - decimalDigit % 10)/ 10;
        }

        return romanNumeral;
    }
}

