package service;

import model.Aluno;
import model.Curso;

import java.util.Optional;

public class Curso_service {
    public static Curso save(Curso curso) {
        return curso;
    }

    public static Optional<Object> findById(Long id) {
        return Optional.empty();
    }

    public static void deleteById(Long id) {
    }

    public Aluno save(Aluno aluno) {
        return null;
    }
}
