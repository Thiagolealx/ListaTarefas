package com.thiagoleal.cursodoglas.Controller;

import com.thiagoleal.cursodoglas.model.Todo;
import com.thiagoleal.cursodoglas.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/todos")
public class TodoController {

    @Autowired
    private TodoRepository repositoryo;

    @PostMapping
    private Todo save(@RequestBody Todo todo){
        return repositoryo.save(todo);
    }


    @GetMapping("{id}")
    public Todo getByID(@PathVariable Long id){
        return repositoryo.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
