package service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Aluno;
import repository.Aluno_repository;

@Service
public class Aluno_service {
    @Autowired
    private Aluno_repository alunoRepository;

    public static Aluno save(Aluno aluno) {
        return aluno;
    }

    public static Optional<Object> findById(Long id) {
        return Optional.empty();
    }

    public static void deleteById(Long id) {
    }

    public static void save(Aluno_repository alunoRepository) {
    }
}





