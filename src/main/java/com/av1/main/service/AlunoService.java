package com.av1.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.av1.main.model.Aluno;
import com.av1.main.repository.AlunoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository AlunoRepository;

    public List<Aluno> listarAlunos() {
        return AlunoRepository.findAll();
    }

    public Optional<Aluno> obterAlunoPorId(Long id) {
        return AlunoRepository.findById(id);
    }

    public Aluno cadastrarAluno(Aluno model) {
        return AlunoRepository.save(model);
    }

    public boolean deletarAlunoPorId(Long id) {
        if (AlunoRepository.existsById(id)) {
            AlunoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Aluno> atualizarAluno(Long id, Aluno updatedModel) {
        return AlunoRepository.findById(id).map(existingModel -> {
            existingModel.setNome(updatedModel.getNome());
            existingModel.setEmail(updatedModel.getEmail());
            existingModel.setCurso(updatedModel.getCurso());
            existingModel.setDataNascimento(updatedModel.getDataNascimento());
            return AlunoRepository.save(existingModel);
        });
    }
}