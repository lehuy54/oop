package lab8;
import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for ( int i : first) {
            for (int j : second) {
                if (i == j) {
                    intersection.add(j);
                }
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>();

        for(int i : first) {
            union.add(i);
        }
        for(int i : second) {
            union.add(i);
        }
        return union;
    }
    //Collection
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);

        return intersection;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);

        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<>(source);
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        List<Integer> listWithoutDuplicates  = new ArrayList<>(new LinkedHashSet<>(source));
        return listWithoutDuplicates;
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        for (int i = 0; i < source.size(); i++) {
            for (int j = i + 1; j < source.size(); j++) {
                if (source.get(i) == source.get(j)) {
                    source.remove(j);
                    j--;
                }
            }
        }
        return source;
    }

    public static String firstRecurringCharacter(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    a = String.valueOf(s.charAt(i));
                    return a;
                }
            }
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> recurringChars = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    recurringChars.add(s.charAt(j));
                }
            }
        }
        return recurringChars;
    }

    public static int[] toArray(Set<Integer> source) {
        int[] array = new int[source.size()];
        for (int i : source) {
            array[i] = i;
        }
        return array;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}


