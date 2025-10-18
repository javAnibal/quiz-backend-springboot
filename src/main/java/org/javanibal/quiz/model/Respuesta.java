package org.javanibal.quiz.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.javanibal.quiz.enums.Opcion;


@Entity
@Table(name = "respuesta")

//Lombok
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String texto;

    @Enumerated(EnumType.STRING)
    private Opcion opcion;
    private boolean esCorrecta;

    @ManyToOne
    @JoinColumn(name = "pregunta_id", nullable = false)
    @JsonBackReference
    private Pregunta pregunta;

}
