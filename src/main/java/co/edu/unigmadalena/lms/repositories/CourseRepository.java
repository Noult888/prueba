package co.edu.unigmadalena.lms.repositories;

import co.edu.unigmadalena.lms.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {

    // 1. Consulta avanzada: "cursos por estudiante"
    // Navega desde Course -> a la lista de Enrollments -> al Student -> busca por el ID
    List<Course> findByEnrollmentsStudentId(UUID studentId);

    // 2. Consulta avanzada: "cursos activos por instructor"
    // Busca los cursos que pertenezcan a un instructor específico Y que el campo 'active' sea true
    List<Course> findByInstructorIdAndActiveTrue(UUID instructorId);
}