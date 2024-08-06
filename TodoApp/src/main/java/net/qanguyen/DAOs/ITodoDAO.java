package net.qanguyen.DAOs;

import net.qanguyen.Models.Todo;
import java.util.List;

public interface ITodoDAO {
    void save(Todo todo);
    void update(Todo todo);
    void delete(Long id);
    Todo getById(Long id);
    List<Todo> getAll();
}