package com.thiagoleal.cursodoglas.Controller;

import com.thiagoleal.cursodoglas.model.LivrariaEntity;
import com.thiagoleal.cursodoglas.repository.LivrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/livraria")
public class LivrariaController {

    @Autowired
    private LivrariaRepository livrariaRepository;

    @PostMapping
    private LivrariaEntity save(@RequestBody LivrariaEntity livraria){
        return livrariaRepository.save(livraria);
    }


    @GetMapping("{id}")
    public LivrariaEntity getByID(@PathVariable Long id){
        return livrariaRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
