package Management;

import java.util.List;

public interface IManager<T> {
    void add(T object);
    void update(int id,T object);
    void delete(int id);
    void display();
    List<T> findByName(String name);
    List<T> findAll();
}
