import java.util.Scanner;

public class QuestionService{
    
    Questions[] questions = new Questions[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Questions(1,"what is value of int?","2","3","4","5","4");
        questions[1] = new Questions(1,"what is value of char?","2","3","4","5","2");
        questions[2] = new Questions(1,"what is value of float?","2","3","4","5","4");
        questions[3] = new Questions(1,"what is value of double?","2","3","4","8","8");
        questions[4] = new Questions(1,"what is value of long?","2","3","8","5","8");
    }

    // public void displayQuestions(){
    //     for(Questions que : questions){
    //         System.out.println(que.toString());
    //     }
    // }

    public void playQuiz(){
        int j=0;
        for(int i=0; i<questions.length; i++){
            System.out.println("Question No: " + questions[i].getId());
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());   
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());
            Scanner sc = new Scanner(System.in);
            selection[j++] = sc.nextLine();
        }
    }

    public void printScore(){
        int i=0, count = 0;
        for(Questions q : questions){
            String actualAns = q.getAnswer();
            String expectedAns = selection[i];
            if(actualAns.equals(expectedAns)){
                count++;
            }
            i++;
        }
        System.out.println("Final score is: " + count);
    }
}