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
public abstract class CollegeStudent extends Student

{

private String degreeType;

public CollegeStudent(){
    
}

public CollegeStudent (String studentName, String studentId,String degreeType) {
    super(studentName,studentId);
this.degreeType=degreeType;

}
public String getDegreeType(String degreeType){
    return degreeType;
}

@Override
public String toString( ) {
    return String.format("%s \n DegreeType is: %s\n",super.toString(),degreeType);
}

}



