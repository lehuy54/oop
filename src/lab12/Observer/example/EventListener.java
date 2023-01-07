package lab12.Observer.example;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
