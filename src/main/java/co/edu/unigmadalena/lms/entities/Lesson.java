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

import java.util.UUID;

@Entity
@Table(name = "lesson")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;


    @Column(name = "order_index")
    private Integer orderIndex;

    /* * RELACIONES
     */


    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
}