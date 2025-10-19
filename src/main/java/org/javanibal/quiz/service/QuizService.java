package org.javanibal.quiz.service;


import org.javanibal.quiz.model.Quiz;
import org.javanibal.quiz.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> findAll(){
        return quizRepository.findAll();
    }

    public Optional<Quiz> findById(Integer id){

        return quizRepository.findById(id);
    }


    public Quiz save(Quiz quiz){
        return quizRepository.save(quiz);
    }



    public void delete(Integer id){
        quizRepository.deleteById(id);
    }


}
