package sv.com.htamayo.java.challenge30daysept;
/*
Day12: Inheritance
link: https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=false
score obtained: 30 of 30
*/

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;
    private String fname;
    private String lname;
    private int badge;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String fn, String ln, int id, int[] grades){
        super(fn, ln, id);
        fname = fn;
        lname = ln;
        badge = id;
        testScores = grades;

    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate(){
        String gradingScale;
        int sumGrades = 0;
        int avgGrades = 0;

        for(Integer curValue: testScores){
            sumGrades += curValue;
        }
        avgGrades = sumGrades/ (testScores.length);

        if(avgGrades < 40){
            gradingScale = "T";
        } else if(avgGrades < 55){
            gradingScale = "D";
        } else if (avgGrades < 70){
            gradingScale = "P";
        } else if (avgGrades < 80){
            gradingScale = "A";
        } else if (avgGrades < 90){
            gradingScale = "E";
        } else {
            gradingScale = "O";
        }

        return gradingScale;

    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
