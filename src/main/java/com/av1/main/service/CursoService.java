package com.av1.main.service;

import com.av1.main.model.Curso;
import com.av1.main.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso salvarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deletarCursoPorId(Long id) {
        cursoRepository.deleteById(id);
    }

    public Curso obterCursoPorId(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }
}