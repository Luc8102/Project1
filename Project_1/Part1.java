//************************************************************** 
// Part1.java     Author: Luc Barenghien  Date: 9/26/2019 
// 
// A GPA calculator that takes various input from the user and 
// outputs GPA
//************************************************************** 
 
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class Part1
{
  
  public static void main(String[] args)
  {
    System.out.println("Welcome to the UNG GPA calculator!"); 
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Please enter your full name."); 
    String name = myObj.nextLine(); 
// I need to be able to split the first name from the last name. 
    System.out.println("Please enter your major"); 
    String major = myObj.nextLine(); 
//This section is code that describes class1 
    System.out.println("Enter course number for your first class."); 
    String class1_number = myObj.nextLine(); 
    System.out.println("Enter number of credits for that class."); 
    int class1_credits = myObj.nextInt(); 
    //jFrame goes here? 
    System.out.println("Enter quality points earned for that class.");
    System.out.println("************************************************");
    System.out.println("A 4.00      |     A- 3.67");
    System.out.println("B+ 3.33     |     B 3.00     |     B- 2.67");
    System.out.println("C+ 2.33     |     C 2.00     |     C- 1.67");
    System.out.println("D+ 1.33     |     D 1.00     |     F 0.00");
    System.out.println("************************************************");
    String class1_points = myObj.nextLine(); 
    float class1_points_float = Float.parseFloat(class1_points); 
//This section is code that describes class2 and is nearly identical to class 1 
    System.out.println("Enter course number for your second class."); 
    String class2_number = myObj.nextLine(); 
    System.out.println("Enter number of credits for that class."); 
    int class2_credits = myObj.nextInt(); 
    //jFrame goes here? 
    System.out.println("Enter quality points earned for that class."); 
    System.out.println("************************************************");
    System.out.println("A 4.00      |     A- 3.67");
    System.out.println("B+ 3.33     |     B 3.00     |     B- 2.67");
    System.out.println("C+ 2.33     |     C 2.00     |     C- 1.67");
    System.out.println("D+ 1.33     |     D 1.00     |     F 0.00");
    System.out.println("************************************************");
    String class2_points = myObj.nextLine(); 
    float class2_points_float = Float.parseFloat(class2_points);  
//This section of code below is that of class 3
    System.out.println("Enter course number for your third class."); 
    String class3_number = myObj.nextLine(); 
    System.out.println("Enter number of credits for that class."); 
    int class3_credits = myObj.nextInt(); 
    //jFrame goes here? 
    System.out.println("Enter quality points earned for that class.");
    System.out.println("************************************************");
    System.out.println("A 4.00      |     A- 3.67");
    System.out.println("B+ 3.33     |     B 3.00     |     B- 2.67");
    System.out.println("C+ 2.33     |     C 2.00     |     C- 1.67");
    System.out.println("D+ 1.33     |     D 1.00     |     F 0.00");
    System.out.println("************************************************");
    String class3_points = myObj.nextLine(); 
    float class3_points_float = Float.parseFloat(class3_points);
//The section shown below is code that describes the student's 4th class and is nearly identical to all other classes in this class file.
    System.out.println("Enter course number for your fourth class."); 
    String class4_number = myObj.nextLine(); 
    System.out.println("Enter number of credits for that class."); 
    int class4_credits = myObj.nextInt(); 
    System.out.println("Enter quality points earned from class 4.");
    System.out.println("************************************************");
    System.out.println("A 4.00      |     A- 3.67");
    System.out.println("B+ 3.33     |     B 3.00     |     B- 2.67");
    System.out.println("C+ 2.33     |     C 2.00     |     C- 1.67");
    System.out.println("D+ 1.33     |     D 1.00     |     F 0.00");
    System.out.println("************************************************");
    String class4_points = myObj.nextLine(); 
    float class4_points_float = Float.parseFloat(class4_points); 
//calculate the final GPA 
    float GPA = (class1_points_float + class2_points_float + class3_points_float + class4_points_float)/(class1_credits + class2_credits + class3_credits + class4_credits);
    DecimalFormat fmt = new DecimalFormat("0.##");
      //must print l;ast name only
    System.out.println(name + "- " + fmt.format(GPA));
   }
}