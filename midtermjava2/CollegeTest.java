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
public class CollegeTest {
     public static void main(String[] args)
    {
        Graduate graduate=new Graduate("Pat","09","Business");
       UnderGraduate undergraduate=new UnderGraduate("Mat","08","Computers");
       
        Student[] students = new Student[2];
        students[0] = graduate;
        students[1] = undergraduate;
        
          System.out.printf("Students processed polymorphically:%n%n");
        
        
             for(Student currentStudent : students)
        {
            System.out.printf("%s%n%n",currentStudent);
       
        }
            
        }
       
    }
    

