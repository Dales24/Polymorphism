/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermjava2;

/**
 *
 * @author patrickdaley1
 */
public abstract class Student {


private String studentName;

private String studentId;
public Student(){
    
}

public Student (String studentName, String studentId) {
this.studentName=studentName;
this.studentId=studentId;

}

 public String getStudentName (String studentName) {
    return studentName;
 }
  public String getStudentId (String studentID) {
    return studentID;
 }
 

@Override
 public String toString( ) {
        return String.format("Student Name is: %s\n Student Id is: %s\n",studentName,studentId);
 }

}

