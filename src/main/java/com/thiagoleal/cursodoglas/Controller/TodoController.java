package com.thiagoleal.cursodoglas.Controller;

import com.thiagoleal.cursodoglas.model.Todo;
import com.thiagoleal.cursodoglas.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/todos")
@CrossOrigin("http://localhost:4200")
public class TodoController {

    @Autowired
    private TodoRepository repositoryo;

    @PostMapping
    private Todo save(@RequestBody Todo todo){
        return repositoryo.save(todo);
    }

    @GetMapping
    public List<Todo> getAll(){
        return repositoryo.findAll();
    }
    @GetMapping("{id}")
    public Todo getByID(@PathVariable Long id){
        return repositoryo.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("{id}")
    public void delete (@PathVariable Long id){
        repositoryo.deleteById(id);
    }
    @PatchMapping("{id}/done")
    public Todo markAsDone(@PathVariable Long id){
        return repositoryo.findById(id).map(todo ->{
            todo.setDone(true);
            todo.setDoneDate(LocalDateTime.now());
            repositoryo.save(todo);
            return todo;
        }).orElse(null);
    }
}
