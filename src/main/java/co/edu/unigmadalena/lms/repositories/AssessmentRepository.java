package co.edu.unigmadalena.lms.repositories;

import co.edu.unigmadalena.lms.entities.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, UUID> {

    // Consulta avanzada: "evaluaciones de un estudiante en un rango"
    // Busca las evaluaciones de un estudiante específico donde la fecha 'takenAt' esté entre dos instantes de tiempo.
    List<Assessment> findByStudentIdAndTakenAtBetween(UUID studentId, Instant fechaInicio, Instant fechaFin);
}