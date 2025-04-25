package com.av1.main.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String descricao;
    private int cargaHoraria; 

    @OneToMany(mappedBy = "curso")
    @JsonBackReference
    private List<Aluno> alunos;
}
