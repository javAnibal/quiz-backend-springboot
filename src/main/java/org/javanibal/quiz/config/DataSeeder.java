package org.javanibal.quiz.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.javanibal.quiz.model.Pregunta;
import org.javanibal.quiz.model.Quiz;
import org.javanibal.quiz.model.Respuesta;
import org.javanibal.quiz.repository.QuizRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {


    private final QuizRepository quizRepository;

    public DataSeeder(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(quizRepository.count() > 0){
            System.out.println("Preguntas cargadas");
            return;
        }

        ObjectMapper mapper = new ObjectMapper();

        InputStream inputStream = getClass().getResourceAsStream("/data/quizzes.json");


        List<Quiz> quizList = List.of(
                mapper.readValue(inputStream, Quiz[].class)
        );

        // Estableciendo conexiones bidireccionales

        for (Quiz quiz : quizList){
            for (Pregunta pregunta : quiz.getPreguntaList()){
                pregunta.setQuiz(quiz);
                for (Respuesta respuesta: pregunta.getRespuestaList()){
                    respuesta.setPregunta(pregunta);
                }
            }
        }

        quizRepository.saveAll(quizList);
        System.out.println("Se han cargado las preguntas");




    }
}
