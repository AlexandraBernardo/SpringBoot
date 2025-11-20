package repository;

import model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Curso_repository extends JpaRepository<Curso, Long> {
}
