package university;

import certification.ExamQuestion;
import static certification.ExamQuestion.*;

/**
 *
 * @author anggomez1
 */
 class AnualExam {

    public static void main(String[] args) {
        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.courseName="Java";
        System.out.println(examQuestion.courseName); //Si la clase ExamQuestion no estuviera pública no podria acceder a la variable courseName.
    }

    AnualExam() {
        marks = 20;//Importo mi variable estatica definida en el paquete certificación.
    }
    
 }
