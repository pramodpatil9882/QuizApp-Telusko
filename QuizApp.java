public class QuizApp{
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        // questionService.displayQuestions();
        questionService.playQuiz();
        questionService.printScore();
    }
}