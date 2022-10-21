//Write a program to input roll no, student name, marks of physics, chemistry and maths out
//        of 100. (0-100). Calculate total, percentage, calculate STATUS (pass, fail) if students scores
//        above 40 in all the 3 subjects the STATUS should be pass otherwise fail. Calculate GRADE if
//        STATUS is pass.
//        Grade must be based on percentage value
//        if percentage is above 70, then grade must be DISTINCTION
//        if percentage is above 60, then grade must be FIRST CLASS
//        if percentage is above 50, then grade must be SECOND CLASS
//        if percentage is above 40, then grade must be PASS CLASS
package One;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your Roll number: ");
        int roll = in.nextInt();

        System.out.println("Enter Your Name: ");
        String name = in.next();

        System.out.println("Enter Your Physics Marks: ");
        float phy = in.nextFloat();

        System.out.println("Enter Your Chemistry Marks: ");
        float chem = in.nextFloat();

        System.out.println("Enter Your Maths Marks: ");
        float math = in.nextFloat();

        float total = phy + chem + math;
        float percentage = (total / 300) * 100;


        Student mitansh = new Student();
        mitansh.Status(phy, chem, math, percentage);

    }
    static class Student{
        void Status(float phy, float chem, float math, float percentage){
            if (phy > 40 && chem > 40 && math > 40) {
                System.out.println("Your Percentage is: "+percentage);
                Grade(percentage);
            }
            else{
                System.out.println("Sorry! You are Fail");
            }

        }
        static void Grade(float percentage) {
            if (percentage > 70.0) {
                System.out.println("Congrats you pass with:" + " DISTINCTION");
            } else if (percentage > 60.0) {
                System.out.println("Congrats you pass with:" + " FIRST CLASS");
            } else if (percentage > 50.0) {
                System.out.println("Congrats you pass with:" + " SECOND CLASS");
            } else if (percentage > 40.0) {
                System.out.println("Congrats you pass with:" + " PASS CLASS");
            }
        }

    }
}

