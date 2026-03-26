package co.edu.unigmadalena.lms.repositories;

import co.edu.unigmadalena.lms.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, UUID> {
    // El CRUD básico para crear o borrar matrículas.
}