package structural_design_patterns.bridge_pattern;

import java.util.ArrayList;
import java.util.List;

public interface Question {
    public void nextQuestion();
    public void previousQuestion();
    public void newQuestion(String q);
    public void deleteQuestion(String q);
    public void displayQuestion();
    public void displayAllQuestions();
}

