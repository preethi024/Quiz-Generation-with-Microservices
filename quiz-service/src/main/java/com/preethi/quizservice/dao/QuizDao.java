package com.preethi.quizservice.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.preethi.quizservice.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}