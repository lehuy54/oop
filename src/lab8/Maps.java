package lab8;
import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map <Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map <Integer, Integer> map, int key) {
        for (int i : map.keySet()) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsKeyValue(Map <Integer, Integer> map, int key, int value) {
        for (int i : map.keySet()) {
            if (i == key) {
                return true;
            }
        }
        for (int i : map.values()) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static Set<Integer> keySet(Map <Integer, Integer> map) {
        Set<Integer> keySet = new LinkedHashSet<>();
        for (int i : map.keySet()) {
            keySet.add(i);
        }
        return keySet;
    }

    public static Collection<Integer> values(Map <Integer, Integer> map) {
        Collection<Integer> values = new LinkedHashSet<>();
        for (int i : map.values()) {
            values.add(i);
        }
        return values;
    }

    public static String getColor(int value) {
        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "black");
        colors.put(1, "white");
        colors.put(2, "red");
        return colors.get(value);
    }
}
