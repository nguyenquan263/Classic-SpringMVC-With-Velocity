package net.qanguyen.Services;

import java.util.List;

import net.qanguyen.Models.Todo;

public interface ITodoService {
    void save(Todo todo);
    void update(Todo todo);
    void delete(Long id);
    Todo getById(Long id);
    List<Todo> getAll();
}
