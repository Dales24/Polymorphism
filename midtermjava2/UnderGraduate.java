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
public class UnderGraduate extends CollegeStudent{
 
    
   public UnderGraduate(String studentName, String studentId,String degreeType){ 
       super(studentName,studentId,degreeType);
       
   }
   @Override
   public String toString(){
       return String.format("%s",super.toString());
   }
    
}
