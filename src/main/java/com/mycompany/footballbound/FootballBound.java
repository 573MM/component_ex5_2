/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.footballbound;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class FootballBound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiveScoreBean score = new LiveScoreBean();
        Subscriber montree = new Subscriber();
        Subscriber pibur = new Subscriber();
        score.addPropertyChangeListener(pibur);
        score.addPropertyChangeListener(montree);
        
        while(true){
            System.out.print("Enter Score --> ");
            String input = sc.nextLine();
                    
            if(input.equals("")){
                break;
            }else{
                score.setScoreLine(input);
            }   
        }
    }
}
