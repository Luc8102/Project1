//************************************************************** 
// UNGStudent.java     Author: Luc Barenghien  Date: 10/21/2019 
// 
// The support file for Part2.java
// Contains methods containing algorithms for use in part2.java
//************************************************************** 
 

//Private variables to pass to the constructor
public class UNGStudent
{
    private String firstName;
    private String lastName;
    private int homework1;
    private int homework2;
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int exam1;
    private int exam2;
  
  //passing parameters to constructor
  public UNGStudent(String first, String last, int homework_1, int homework_2, int quiz_1, int quiz_2, int quiz_3, int exam_1, int exam_2)
  {
      firstName = first;
      lastName = last;
      homework1 = homework_1;
      homework2 = homework_2;
      quiz1 = quiz_1;
      quiz2 = quiz_2;
      quiz3 = quiz_3;
      exam1 = exam_1;
      exam2 = exam_2;
  }
   
  public String getFullName()
  {
    return firstName + lastName;
  }
  public void setGrades(int homework_1,int homework_2,int quiz_1,int quiz_2,int quiz_3,int exam_1,int exam_2)
  {
    homework1 = homework_1;
    homework2 = homework_2;
    quiz1 = quiz_1;
    quiz2 = quiz_2;
    quiz3 = quiz_3;
    exam1 = exam_1;
    exam2 = exam_2;
  }
  //the following code calculates the average grade of each class.
  public double calcHW()
  {
    return (((homework1+homework2)/2)*0.25);
  }
  public double calcQuiz()
  {
    return (((quiz1+quiz2+quiz3)/3)*0.32);
  }
  public double calcExam()
  {
    return (((exam1+exam2)/2)*0.43);
  }
  //the requested to string method
  public String toString()
  {
    String grades = "First homework=" + homework1 + "," + "Second homework=" + homework2 + ",";
    grades += "First quiz=" + quiz1 + ",";
    grades += "Second quiz=" + quiz2 + ",";
    grades += "Thrid quiz=" + quiz3 + ",";
    grades += "First exam=" + exam1 + ",";
    grades += "Second exam=" + exam2;
    return grades;
  }
}