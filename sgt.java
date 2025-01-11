import java.util.ArrayList;
import java.util.Scanner;

class Sgt {

    public static void main(String[] args) {
        
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Tracker Repository for Codesoft Internship*");
        System.out.println("**********************");


        while (true) {
            System.out.print("Enter a student's grade (type 'over' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("over")) {
                break;
            }

            try {
                double grade = Double.parseDouble(input);
                if (grade >= 0 && grade <= 100) {
                    grades.add(grade);
                } else {
                    System.out.println("Grade must be between 0 and 100. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value for the grade.");
            }
        }

      
        if (grades.isEmpty()) {
            System.out.println("No grades were entered. OVER");
        } else {

            double total = 0;
            double highest = Double.MIN_VALUE;
            double lowest = Double.MAX_VALUE;

            for (double grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = total / grades.size();

            //finql
            System.out.println("\nGrade Summary:");
            System.out.println("=================");
            System.out.printf("Total Students: %d\n", grades.size());
            System.out.printf("Average Grade: %.2f\n", average);
            System.out.printf("Highest Grade: %.2f\n", highest);
            System.out.printf("Lowest Grade: %.2f\n", lowest);
              System.out.println("===============================");
        }

        scanner.close();
    }
}
