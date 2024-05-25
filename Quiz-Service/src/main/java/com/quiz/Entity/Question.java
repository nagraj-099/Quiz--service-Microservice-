package com.quiz.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
public class Question {
        private Long QuestionId;
        private String question;
        private Long quizId;
}
