package com.thiagoleal.cursodoglas.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class LivrariaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String editora;

    @Column
    private Boolean done;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy  HH:mm")
    private LocalDateTime createDate;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy  HH:mm")
    private LocalDateTime doneDate;

    @PrePersist
    public void beforeSave(){
        setCreateDate(LocalDateTime.now());
    }

}
