package org.javanibal.quiz.service;

import org.javanibal.quiz.model.Respuesta;
import org.javanibal.quiz.repository.RespuestaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespuestaService {

    private final RespuestaRepository respuestaRepository;

    public RespuestaService(RespuestaRepository respuestaRepository) {
        this.respuestaRepository = respuestaRepository;
    }

    public List<Respuesta> findAll() {
        return respuestaRepository.findAll();
    }

    public Optional<Respuesta> findById(Integer id) {
        return respuestaRepository.findById(id);
    }

    public Respuesta save(Respuesta respuesta) {
        return respuestaRepository.save(respuesta);
    }

    public void delete(Integer id) {
        respuestaRepository.deleteById(id);
    }
}
