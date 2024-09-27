/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumerations.pkg2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Enumerations2 {

    /**
     * @param args the command line arguments
     */
    
    enum TimesOfDay{
        MORNING, AFTERNOON, EVENING, NIGHT
    }
    public static void main(String[] args) {
        /* program prompts usr to enter input
        search the enum created and siplay a message
        */
        
        //Import scanner
        Scanner kb = new Scanner(System.in);
        
        //prompt user to enter time of day
        System.out.println("Please enter a time of day: ");
        String userInput = kb.nextLine().toUpperCase(); //since our enum is in all caps, while user input likely lowercase
        
        //check user input with enumeration using valueOf method
       TimesOfDay time = TimesOfDay.valueOf(userInput); //converted userInput to our new TimesOfDay data type using valueOf and saving it to a new variable called time
       
       switch(time) {
           case MORNING:
               System.out.println("Good Morning!!");
               break;
           case AFTERNOON:
               System.out.println("Good Afternoon, Hope its a productive day !!");
               break;
           case EVENING:
               System.out.println("Good Evening, Time to wind down");
               break;
           case NIGHT:
               System.out.println("Good Night");
               break;
               
       }
        
        
        
        
        
    }
    
}
