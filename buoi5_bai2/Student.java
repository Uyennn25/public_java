
package buoi5_bai2;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Classs;
    private double Score;
    private Faculty y = new Faculty();

    public Student() {
    }

    public Student(String Name, String Class, double Score, Faculty y) {
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.y = y;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getClasss() {
        return Classs;
    }

    public void setClass(String Class) {
        this.Classs = Classs;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    public void Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input name of student: " );
        Name = sc.nextLine();
        System.out.println("Input class of student: " );
        Classs = sc.nextLine(); 
        System.out.println("Input score of student: " );
        Score = sc.nextDouble();
        y.Input();
    }
    public void Output(){
        System.out.println("Name of student: " + Name);
        System.out.println("Class of Student: " + Classs);
        System.out.println("Score of double: " + Score);
        y.Output();
    }
    
}
