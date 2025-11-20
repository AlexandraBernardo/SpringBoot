package repository;

import model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Aluno_repository extends JpaRepository<Aluno, Long> {

}
