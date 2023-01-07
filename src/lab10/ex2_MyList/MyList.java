package lab10.ex2_MyList;

public interface MyList {
    void add(Object o);
    void add(Object o, int index);
    void remove(int index);
    Object get(int index);
    int size();
}
