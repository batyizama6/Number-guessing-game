/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumberguess;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */
public class Randomnumberguess {

    public static void main(String[] args) {
       Random obj = new Random();
       
       int secretNumber= obj.nextInt(100)+1;
       int userGuess=0;
       
       while (userGuess == userGuess){
           if (userGuess>secretNumber){
               JOptionPane.showMessageDialog(null,"Your guess is too high");
           }
           else if (userGuess>secretNumber){
               JOptionPane.showMessageDialog(null,"Your guess is too low");
           }
           else {
              JOptionPane.showMessageDialog(null,"you won!"); 
           }
       }
    }
}
