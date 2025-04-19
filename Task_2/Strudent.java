package Task_2;

import java.util.ArrayList;

public class Strudent {
    private String name;
    private ArrayList<Subject> subjects;

    public Strudent(String name){
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subjectName, int marks) {
        subjects.add(new Subject(subjectName, marks));
    }

    //For get total marks
    public int getTotalMarks(){
        int totalMarks = 0;
        for(Subject s : subjects){
            totalMarks += s.getMarks();
        }
        return totalMarks;
    }

    //get average presentatge
    public double getAverageMarks(){
        if(subjects.isEmpty()){
            return 0;
        }
        return (double) getTotalMarks() / subjects.size();
    }

    //Assigning Grade based on the avg marks
    public String getuserGrade(){
        double avg = getAverageMarks();
        if(avg >= 90){
            return "A+";
        }
        else if(avg >= 80){
            return "A";
        }
        else if (avg >= 70) {
            return "A-";
        }
        else if (avg >= 60) {
            return "B+";
        }
        else if (avg >= 50) {
            return "B";
        }
        else if (avg >= 45) {
            return "C+";
        }
        else if (avg >= 39.9) {
            return "C";
        }
        else{
            return "RX"; // Rx mean Reseat (Fallow university guide )
        }
    }

    // Result display
    public void resultSys(){
        System.out.println("Result for: " + name);

        for (Subject s : subjects){
            System.out.println(s.getName() + " : "+ s.getMarks() + " /100");
        }
        System.out.println("Total marks: " + getTotalMarks());
        System.out.println("Average marks: " + getAverageMarks());
        System.out.println("Grade: " + getuserGrade());

    }

}
