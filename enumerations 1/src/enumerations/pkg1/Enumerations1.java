/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumerations.pkg1;

/**
 *
 * @author lab_services_student
 */
public class Enumerations1 {

    /**
     * @param args the command line arguments
     */
    
    //create an enumeration - notice how its created *outside* of the main method
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY //should declare text in all caps when doing enumeration
    }
    public static void main(String[] args) {
        /* an enumerated data type is a programmer-created
        data type with a fixed set of values
        */
        
        //create a variable to hold the day --> assign a value 
        Day today = Day.SUNDAY; //data type is the one we created through enumeration
        
        //create a Switch Statement
        switch(today) {
            case MONDAY: 
                System.out.println("Start of the week");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!!!");
                break;
            case SATURDAY:
            case SUNDAY: //in this situaiton, both cases will print out the same message
                System.out.println("It's the weekend!!!!!!!");
                break;
            default:
                System.out.println("Midweek is hectic :(");
                break;
                
        }//end of switch statement
        
        
        
        
        
        
        
        
        
    }
    
}
