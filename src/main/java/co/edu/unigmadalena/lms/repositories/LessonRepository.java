package co.edu.unigmadalena.lms.repositories;

import co.edu.unigmadalena.lms.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, UUID> {

    // Consulta avanzada: "lecciones por curso ordenadas"
    // Busca todas las lecciones de un curso y añade un "ORDER BY order_index ASC" automáticamente en SQL.
    List<Lesson> findByCourseIdOrderByOrderIndexAsc(UUID courseId);
}