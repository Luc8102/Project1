//************************************************************** 
// Part2.java     Author: Luc Barenghien  Date: 10/21/2019 
// 
// Contains code that retreives grade information from the user
// and uses the support class to work with it and dispays GPA
//************************************************************** 
 
import java.util.Scanner;
 
public class Part2
{
  
  public static void main(String[] args)
  {
      Scanner myObj = new Scanner(System.in);
   //Student 1 starts
      System.out.println("Please enter first name for student 1.");
      String firstName = myObj.nextLine();
      System.out.println("Please enter last name for student 1.");
      String lastName = myObj.nextLine();
      int homework1,homework2;
      int quiz1,quiz2,quiz3;
      int exam1,exam2;
      System.out.println("Please enter first homework grade for student 1");
      homework1 = myObj.nextInt();
      System.out.println("Please enter second homework grade for student 1");
      homework2 = myObj.nextInt();
      
      System.out.println("Please enter first quiz grade for student 1");
      quiz1 = myObj.nextInt();
      System.out.println("Please enter second quiz grade for student 1");
      quiz2 = myObj.nextInt();
      System.out.println("Please enter third quiz grade for student 1");
      quiz3 = myObj.nextInt();
      
      System.out.println("Please enter first exam grade for student 1");
      exam1 = myObj.nextInt();
      System.out.println("Please enter second exam grade for student 1");
      exam2 = myObj.nextInt();
      //the object is created after all user data is collected and stores it as the student 1 object
      UNGStudent ungStudent1 = new UNGStudent(firstName,lastName,homework1,homework2,quiz1,quiz2,quiz3,exam1,exam2);
      
      //Student 2 is below
      System.out.println("Please enter first name for student 2.");
      firstName = myObj.nextLine();
      firstName = myObj.nextLine();
      System.out.println("Please enter last name for student 2.");
      lastName = myObj.nextLine();
      System.out.println("Please enter first homework grad for student 2");
      homework1 = myObj.nextInt();
      System.out.println("Please enter second homework grade for student 2");
      homework2 = myObj.nextInt();
      
      System.out.println("Please enter first quiz grade for student 2");
      quiz1 = myObj.nextInt();
      System.out.println("Please enter second quiz grade for student 2");
      quiz2 = myObj.nextInt();
      System.out.println("Please enter third quiz grade for student 2");
      quiz3 = myObj.nextInt();
      
      System.out.println("Please enter first exam grade for student 2");
      exam1 = myObj.nextInt();
      System.out.println("Please enter second exam grade for student 2");
      exam2 = myObj.nextInt();
      //the line of code below is of the same idea as student 1, but it's for student 2.
      UNGStudent ungStudent2 = new UNGStudent(firstName,lastName,homework1,homework2,quiz1,quiz2,quiz3,exam1,exam2);
      ungStudent2.setGrades(97,77,84,91,64,55,72);
      //Student 2's grades are set to the predefined grades detailed in the professor's instructions.
      
      System.out.println(firstName + " " + lastName + "Student 1 grades: " + (ungStudent1.calcHW()+ungStudent1.calcQuiz()+ungStudent1.calcExam()));
      System.out.println(firstName + " " + lastName + "Student 2 grades: " + (ungStudent2.calcHW()+ungStudent2.calcQuiz()+ungStudent2.calcExam()));
    }
}