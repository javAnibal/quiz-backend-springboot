package org.javanibal.quiz.model;

import jakarta.persistence.*;
import lombok.*;
import org.javanibal.quiz.enums.Opcion;


@Entity
@Table(name = "respuestas")

//Lombok
@Getter
@Setter
@Data
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
    @JoinColumn(name = "preguntas_id")
    private Pregunta pregunta;

}
