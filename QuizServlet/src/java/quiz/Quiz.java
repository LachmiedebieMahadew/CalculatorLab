/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Kadjal
 */
public class Quiz {
    private int index=0;
    private int score=0;
    
    private static String[] questions={
        "3,1,4,1,5",//Pi
        "1,1,2,3,5",//fibonaci
        "1,4,9,16,25",//squares
        "2,3,5,7,11",//primes
        "1,2,4,8,16"//power of 2
     };
    public static int[]answers={9,8,36,13,32};
    
    public void incrementIndex(){
        index++;
    }
    
    public int getIndex(){
    return index;
    }
    
    
    public void incrementScore(){
    score++;
    }
    
    public int getScore(){
    return score;
    }
    
    public static String[] getQuestion(){
    return questions;
    }
    
}
