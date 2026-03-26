package co.edu.unigmadalena.lms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "instructor_profile")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class InstructorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;

    private String phone;


    @Column(columnDefinition = "TEXT")
    private String bio;

    /* * RELACIONES
     */


    @OneToOne
    @JoinColumn(name = "instructor_id", referencedColumnName = "id", nullable = false)
    private Instructor instructor;
}