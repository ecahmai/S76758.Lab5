/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5_act1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ms Aisyah
 */
public class Lab5_act1 {

    public static void main(String[] args) {
       int currentYear = 2024;
        
        String identityCard = JOptionPane.showInputDialog("Enter 12 digit ic number without (-): ");
        
        String yearPart = identityCard.substring(0,2); 
        String monthPart = identityCard.substring(2,4);
        String dayPart = identityCard.substring(4,6);

        int birthYear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);
        
        if (birthYear <= 24){
            birthYear += 2000;
        }else if (birthYear >24){
            birthYear += 1900;
        }else {
            System.out.println("error");
        }
                
        int age = currentYear - birthYear;
        
        String message = String.format("Birth year: %d", birthYear)+String.format("\nBirth date: %d/%d/%d", day, month, birthYear)+ String.format("\nAge: %d", age);
        JOptionPane.showMessageDialog(null, message ); 
    }
    
}
