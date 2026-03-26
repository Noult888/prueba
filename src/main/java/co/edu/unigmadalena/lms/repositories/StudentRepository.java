package co.edu.unigmadalena.lms.repositories;

import co.edu.unigmadalena.lms.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {

    // 1. Aquí el CRUD completo gratis gracias a JpaRepository.

    // 2. Consulta avanzada pedida por el profesor: "estudiantes por curso"
    // Spring Data JPA lee el nombre del método, navega de la entidad Student -> a la lista de Enrollments -> al Course -> y busca por el ID.
    List<Student> findByEnrollmentsCourseId(UUID courseId);
}