package MultipleClasses;

import java.util.*;

public class Question {
    private int questionId;
    private Answer answers;
    private String[] answerKey;
    private int score;
    private int techStackId;
    private int assignmentId;

    public Question(int questionId, Answer answers, String[] answerKey, int score, int techStackId, int assignmentId) {
        this.questionId = questionId;
        this.answers = answers;
        this.answerKey = answerKey;
        this.score = score;
        this.techStackId = techStackId;
        this.assignmentId = assignmentId;
    }

    // getters and setters here

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public Answer getAnswers() {
        return answers;
    }

    public void setAnswers(Answer answers) {
        this.answers = answers;
    }

    public String[] getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(String[] answerKey) {
        this.answerKey = answerKey;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, answers, answerKey, score, techStackId, assignmentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Question question = (Question) obj;
        return questionId == question.questionId &&
                score == question.score &&
                answerKey == question.answerKey &&
                techStackId == question.techStackId &&
                assignmentId == question.assignmentId &&
                Objects.equals(answers, question.answers);
    }
}
