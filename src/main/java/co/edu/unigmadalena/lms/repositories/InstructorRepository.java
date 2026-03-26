package co.edu.unigmadalena.lms.repositories;

import co.edu.unigmadalena.lms.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, UUID> {
    // Aquí no necesitamos consultas extra por ahora, el CRUD básico es suficiente.
}