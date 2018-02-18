import java.util.ArrayList;
import java.util.List;
import  java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;


public class CompStrategyDemo{

  public static void main(String args[]){
    
    /*Creating list of student*/
    Student nancy=new Student("Nancy ",3.8f);
    Student jack=new Student("Jack ",3.14f);
    Student sara=new Student("Sara ",3.7f);
    
    /*Adding into  the student list*/
    List<Student> students=Arrays.asList(sara,jack,  nancy);

    /*Printing unsorted student list*/
    System.out.println("Not sorted");
    Util.printStudents(students);

    /*Printing student list sorted by student name*/
    System.out.println("\nSorted by Name");
    Collections.sort(students,new SortByName());
    Util.printStudents(students);

    /*Printing student list sorted by student GPA*/
    System.out.println("\nSorted by GPA");
    Collections.sort(students,new SortByGPA());
    Util.printStudents(students);

  }
  
}



class Util{
  public static void printStudents(List<Student> students){
    for(Student std:students){
      System.out.println(std.toString());
    }
  }
}



/*Class implementing Comparator*/
class SortByName implements Comparator<Student>
{
    public int compare(Student std1, Student std2)
    {
         return std1.getFullName().compareTo(std2.getFullName());
    }
}



/*Class implementing Comparator*/
class SortByGPA implements Comparator<Student>
{

    public int compare(Student std1, Student std2)
    {
        if(std1.getGPA()>std2.getGPA()){
          return 1;
        }
        if(std1.getGPA()<std2.getGPA()){
          return -1;
        }
        return 0;
    }
}



/*Student Class*/
class Student{
  private String FullName;
  private float GPA;

  public Student(String fullName,float gpa){
    this.FullName=fullName;
    this.GPA=gpa;
  }
  public float getGPA(){
    return this.GPA;
  }

  public String getFullName(){
    return this.FullName;
  }
  
  public String toString(){
        return "Full Name : "+this.FullName + " " +
                "GPA : "+" "+this.GPA;
  }

}