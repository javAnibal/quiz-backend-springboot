package org.javanibal.quiz.model;

import org.javanibal.quiz.enums.Opcion;

public class Respuesta {
    private Integer id;
    private String texto;
    private Opcion opcion;
    private boolean esCorrecta;
    private Pregunta pregunta;

}
