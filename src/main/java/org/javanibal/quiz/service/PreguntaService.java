package org.javanibal.quiz.service;

import org.javanibal.quiz.model.Pregunta;
import org.javanibal.quiz.repository.PreguntaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {

    private final PreguntaRepository preguntaRepository;

    public PreguntaService(PreguntaRepository preguntaRepository) {
        this.preguntaRepository = preguntaRepository;
    }

    public List<Pregunta> findAll() {
        return preguntaRepository.findAll();
    }

    public Optional<Pregunta> findById(Integer id) {
        return preguntaRepository.findById(id);
    }

    public Pregunta save(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    public void delete(Integer id) {
        preguntaRepository.deleteById(id);
    }

}
