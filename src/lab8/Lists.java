package lab8;
import java.lang.reflect.Array;
import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0,value);
    }
    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }
    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2,value);
    }
    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }
    public static void removeEvil(ArrayList<Integer> list) {
        list.remove(Integer.valueOf(666));
    }
    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> square = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            square.add(i*i);
        }
        return square;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        for (int i : list) {
            if (list.get(i) == value) {
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target = (ArrayList) source.clone();
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.add(list.get(i));
        }
    }

    public static void insertBeginningEnd (LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
