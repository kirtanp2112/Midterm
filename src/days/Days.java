/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author kirtan 
 */
public class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the day number (one,two,three,four,five) in string");
    String code = in.next();
    Weekdays t= new Weekdays();
    t.nameOfDay(code);
    }// TODO code application logic here
    
    public enum Day {
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");

    private String dayName;

    Day(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}

}
