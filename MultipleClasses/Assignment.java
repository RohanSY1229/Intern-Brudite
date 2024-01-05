package MultipleClasses;

import java.time.LocalDate;
import java.util.*;

class Assignment {

    private int assignmentId;
    private String title;
    private String description;
    private LocalDate dueDate;
    private List<Question> questions;

    public Assignment(int assignmentId, String title, String description, LocalDate dueDate, List<Question> question) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.questions = question;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // Other getters and setters...

    @Override
    public int hashCode() {
        return Objects.hash(assignmentId, title, description, dueDate, questions);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Assignment that = (Assignment) obj;
        return assignmentId == that.assignmentId &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(dueDate, that.dueDate) &&
                Objects.equals(questions, that.questions);
    }
}
