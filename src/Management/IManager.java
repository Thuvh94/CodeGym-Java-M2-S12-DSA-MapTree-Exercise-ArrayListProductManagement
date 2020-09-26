package Management;

import java.util.List;

public interface IManager<T> {
    void add(T object);
    void update(int id,T object);
    void delete(int id);
    void display();
    T findById(int id) throws Exception;
    List<T> findByName(String name);
    List<T> findByPrice(long price);
    List<T> findAll();
}
