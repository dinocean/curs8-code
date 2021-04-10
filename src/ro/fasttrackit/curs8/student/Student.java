package ro.fasttrackit.curs8.student;

public class Student {
    private String studentName;
    private static int grade = 275;
    private static int numStudent = 30;


    public Student(String studentName){
        this.studentName = studentName;
    }


    public String getStudentName(){
        return studentName;
    }

    public int getGrade(){
        return grade;
    }

    public int getNumStudent(){
        return numStudent;
    }

    public static double getAvarageGrade(){
        return grade / numStudent;
    }

}
