/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10375530_sectiona;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lab_services_student
 */


public class ST10375530_SectionA {

    /**
     * @param args the command line arguments
     */
     private static List<student> students = new ArrayList<>();
    public static void main(String[] args) {


        int response, menuItems = 0, newStudent = 0;
        student student1 = new student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        student student2 = new student(10112, "J.Doe", 21, "jdoe@ymail.com", "disd");
        student student3 = new student(10113, "P.Parker", 20, "spidey@ymail.com", "disn");
        
        response = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION" 
                                     + "\n****************************************" 
                                     + "\nEnter (1) to launch menu or any other key to exit"));
        
        
        if (response == 1) {
            menuItems = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items: "
                                         + "\n(1) Capture a new student." + "\n(2) Search for a new student."
                                         + "\n(3) Delete a student." + "\n(4) Print student report." + "\n(5) Exit Application."));
        
            switch (menuItems) {
                case 1:
                    saveStudent();
                    menuItems = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items: "
                                         + "\n(1) Capture a new student." + "\n(2) Search for a new student."
                                         + "\n(3) Delete a student." + "\n(4) Print student report." + "\n(5) Exit Application."));
                    break;
                case 2:
                    searchStudent();
                    menuItems = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items: "
                                         + "\n(1) Capture a new student." + "\n(2) Search for a new student."
                                         + "\n(3) Delete a student." + "\n(4) Print student report." + "\n(5) Exit Application."));
        
                    break;
                case 3:
                    deleteStudent();
                    menuItems = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items: "
                                         + "\n(1) Capture a new student." + "\n(2) Search for a new student."
                                         + "\n(3) Delete a student." + "\n(4) Print student report." + "\n(5) Exit Application."));
        
                    break;
                case 4:
                    printStudentReport();
                    menuItems = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items: "
                                         + "\n(1) Capture a new student." + "\n(2) Search for a new student."
                                         + "\n(3) Delete a student." + "\n(4) Print student report." + "\n(5) Exit Application."));
        
                    break;
                case 5:
                    exitApplication();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        
        } else if (response !=1) {
            JOptionPane.showMessageDialog(null, "Exiting the menu items...");
        }
            
        
        
    }
    
    private static void saveStudent() {
         
        JOptionPane.showMessageDialog(null, "CAPTURE A NEW STUDENT"
                                      + "\n**********************************");
        
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the student id: "));
        String name = JOptionPane.showInputDialog("Enter the student name: "); 

        int studentAge;
        do {
            studentAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the student age: "));
            while (studentAge < 0) {
                JOptionPane.showMessageDialog(null, "Age enetered is Invalid. Please re-enter the student age: ");
                studentAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the student age: ")); 
            }
        } while (studentAge < 16 || studentAge <= 0);
            String email = JOptionPane.showInputDialog("Enter the student email: ");
            String course = JOptionPane.showInputDialog("Enter  the student course: ");
            student student = new student(id, name, studentAge, email, course);
            //student.add(student);
            students.add(student);

            JOptionPane.showMessageDialog(null, "Student details have been successfully saved.");
    }
    
    private static void searchStudent() {//(JavaTPoint, 2023)
        int searchID = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID no. of the student you would like to search for: "));

        boolean found = false;
        for (student student : students) {
            if (student.getId() == searchID) {
                displayStudentDetails(student);
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Student with Student ID: " + searchID + " was not found.");
        }
    }

    private static void deleteStudent() {//(Ghahrai. 2020)
        int deleteID = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID No. of the student you would like to delete: "));

        boolean deleted = false;
        for (student student : students) {
            if (student.getId() == deleteID) {
                students.remove(student);
                deleted = true;
                JOptionPane.showMessageDialog(null, "Student with Student ID: " + deleteID + " was deleted.");
                break;
            }
        }

        if (!deleted) {
            JOptionPane.showMessageDialog(null, "Student with Student Id: " + deleteID + " was not found therefore cannot be deleted.");
        }
    }

    private static void printStudentReport() {
        JOptionPane.showMessageDialog(null, "STUDENT REPORT: \n");

        for (student student : students) {
            displayStudentDetails(student);
        }

        JOptionPane.showMessageDialog(null, "Enter (1) to launch menu or any other key to exit");
    }

    private static void displayStudentDetails(student student) {
        JOptionPane.showMessageDialog(null,"STUDENT ID: " + student.getId()
        + "\nSTUDENT NAME: " + student.getName()
        + "\nSTUDENT AGE: " + student.getAge()
        + "\nSTUDENT EMAIL: " + student.getEmail()
        + "\nSTUDENT COURSE: " + student.getCourse());
    }

    private static void exitApplication() {
        JOptionPane.showMessageDialog(null,"Exiting the application.");
        
    } 
    
    
    
     
}
//Reference List:
//Farrell, J. 2017. Java Programming. Ninth Edition. Boston: Cengage Learning.
//Ghahrai, A. 2020. How to Delete Files and Directories in Java. [Online]. Available at: https://devqa.io/java-delete-files-directories/ [Accesssed 1 July 2023].
//JavaTPoint. 2023. Linear Search in Java. [Online]. Available at: https://www.javatpoint.com/linear-search-in-java [Accessed at 1 Junly 2023].
   