package co.edu.unigmadalena.lms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "enrollment")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String status;

    @Column(name = "enrolled_at")
    private Instant enrolledAt;

    /* * RELACIONES
     */

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;


    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
}