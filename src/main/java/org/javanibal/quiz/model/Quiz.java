package org.javanibal.quiz.model;

import jakarta.persistence.*;
import lombok.*;
import org.javanibal.quiz.enums.Categoria;

import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name="cuestionarios")

//Lombok
@Getter
@Setter
@Data // -> construye ToString - [entre otros]
@NoArgsConstructor
@AllArgsConstructor

public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pregunta> preguntaList = new ArrayList<>();




}
