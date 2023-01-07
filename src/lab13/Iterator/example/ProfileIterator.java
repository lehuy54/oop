package lab13.Iterator.example;

public interface ProfileIterator {
    Profile getNext();
    boolean hasMore();

    void reset();
}
