package com.personalizedlearningplateform;

import java.util.List;

public class Quiz {
    private final List<String> questions;
    private final List<String> correctAnswers;
    private int score;

    public Quiz(List<String> questions, List<String> answers, String difficultyLevel) {
        this.questions = List.copyOf(questions);
        this.correctAnswers = List.copyOf(answers);
        this.score = 0;

        System.out.println("Quiz created with difficulty: " + difficultyLevel);
    }

    public int attemptQuiz(List<String> learnerAnswers) {
        int correctCount = 0;
        for(int i = 0; i < learnerAnswers.size(); i++) {
            if (learnerAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i))) {
                correctCount++;
            }
        }
        score = (correctCount * 100) / questions.size();
        return score;
    }

    public int getScore() {
        return score;
    }

    public double getPercentage() {
        return score;
    }
}