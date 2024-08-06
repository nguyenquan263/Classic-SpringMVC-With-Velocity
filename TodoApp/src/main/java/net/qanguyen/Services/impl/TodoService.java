package net.qanguyen.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.qanguyen.DAOs.impl.TodoDAO;
import net.qanguyen.Models.Todo;
import net.qanguyen.Services.ITodoService;

@Service
@Transactional
public class TodoService implements ITodoService {

    @Autowired
    private TodoDAO todoDao;

    @Override
    public void save(Todo todo) {
        todoDao.save(todo);
    }

    @Override
    public void update(Todo todo) {
        todoDao.update(todo);
    }

    @Override
    public void delete(Long id) {
        todoDao.delete(id);
    }

    @Override
    public Todo getById(Long id) {
        return todoDao.getById(id);
    }

    @Override
    public List<Todo> getAll() {
        return todoDao.getAll();
    }
}
