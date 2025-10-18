package org.javanibal.quiz.repository;

import org.javanibal.quiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {
}
