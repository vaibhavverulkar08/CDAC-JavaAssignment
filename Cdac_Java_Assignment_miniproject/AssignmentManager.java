/*Java Assignment - 07.11.2023 submitted by VaibhavVerulkar*/

package Cdac_Java_Assignment_miniproject;
//import java.util.Date;


import java.util.Scanner;


class Student {
    public String name;
    public int prnNo;
    public Student(String name, int prnNo) {
        this.name = name;
        this.prnNo = prnNo;
        
        System.out.println("Student Info:");
        System.out.println("Name of the Student: " + name + "\nPRN Number of the student: " + prnNo);
 }
    
//     void studentInfo(){
//    Scanner s = new Scanner(System.in);  
//    System.out.println("Enter Student Name");
//    String stName = s.nextLine();  
//    
//    System.out.println("Enter Student PRN Number");
//    int stprn = s.nextInt();
//    System.out.println("PRN Number of Student "+stName + " is:" + stprn);  
//    }
//    
    
}
class Trainer {
    public String name;
//    public Trainer(String name) {
//        this.name = name;
//        System.out.println("Trainer Info:");
//        System.out.println("Name of the Trainer is : " + name);
//    }
    
    void trainerInfo(){
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter Trainer Name");
    String trName = myObj.nextLine();  
    System.out.println("Trainer Name is: " + trName);  
    }
}
class Assignment {
    private String title;
    private String date;
    private String Description;
    private String assignee;

    public Assignment(String title, String date, String Description, String assignee) {
        this.title = title;
        this.date = date;
        this.Description = Description;
        this.assignee = assignee;
        System.out.println("Assignment Details:\n" + "Assignment Title:" + title + "\nDate: " + date + "\nDescription: " + Description + "\nAssigne name: " + assignee);
    }

}

public class AssignmentManager {
 
    public void createAssignment() {
        System.out.println("Assignment is created");
    }

    public void addAssignment() {
        System.out.println("Assignment is Added");
    }

//    public void saveAssignment() {
//    }
//
//    public void loadAssignment() {
//    }
//
//    public void showAssignments() {
//    }

    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student("Vaibhav", 1);
        //s1.studentInfo();
//        Trainer t1 = new Trainer("Anup Sir");
        Trainer t1 = new Trainer();
        t1.trainerInfo();
        AssignmentManager obj = new AssignmentManager();
        
        System.out.println("----------------");
        obj.createAssignment();
        System.out.println("----------------");
        Assignment as1 = new Assignment("Assignment no1", "07112023", "This is assignment one", "Vaibhav");
        System.out.println("----------------");
        obj.addAssignment();

//        obj.saveAssignment();
//        obj.loadAssignment();
//        obj.showAssignments();

    }
}
