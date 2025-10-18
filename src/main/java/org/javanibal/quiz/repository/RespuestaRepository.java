package org.javanibal.quiz.repository;

import org.javanibal.quiz.model.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {
}
