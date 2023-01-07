package lab10.ex3_MyMap;

public interface MyMap {
    int size();
    void put(Object key, Object value);
    void remove(Object key);
    boolean contains(Object key);
    Object get(Object key);
}
