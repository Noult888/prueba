package co.edu.unigmadalena.lms.repositories;

import co.edu.unigmadalena.lms.entities.InstructorProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InstructorProfileRepository extends JpaRepository<InstructorProfile, UUID> {
    // El CRUD básico es suficiente para el perfil.
}