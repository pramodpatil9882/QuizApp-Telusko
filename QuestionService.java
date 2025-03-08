public class QuestionService{
    
    Questions[] questions = new Questions[5];

    public QuestionService() {
        questions[0] = new Questions(1,"what is value of int?","2","3","4","5","4");
        questions[1] = new Questions(1,"what is value of char?","2","3","4","5","2");
        questions[2] = new Questions(1,"what is value of float?","2","3","4","5","4");
        questions[3] = new Questions(1,"what is value of double?","2","3","4","8","8");
        questions[4] = new Questions(1,"what is value of long?","2","3","8","5","8");
    }

    public void displayQuestions(){
        for(Questions que : questions){
            System.out.println(que.toString());
        }
    }
}