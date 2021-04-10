package ro.fasttrackit.curs8.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Angelo");
        System.out.println("Student name is: " + student.getStudentName());
        System.out.println("The sum of all the grades: " + student.getGrade());
        System.out.println("The number of students: " + student.getNumStudent());
        System.out.println("The the avarage grade: " + student.getAvarageGrade());
    }
}
