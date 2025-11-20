package controller;

import model.Aluno;
import model.Curso;
import repository.Curso_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.Curso_service;

import java.util.List;

@RestController

public class Curso_controller {

    @Autowired
    private Curso_repository cursoRepository;

    @GetMapping
    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public Curso criarCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscarPorId(@PathVariable Long id) {
        return cursoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return Curso_service.save(curso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
        if (Curso_service.findById(id).isPresent()) {
            Curso_service.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
