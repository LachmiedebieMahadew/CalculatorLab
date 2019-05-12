/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

/**
 *
 * @author Anish
 */
public class Quiz {
    
    private int score = 0;
    private int count = 0;
    private int tries = 3;
    private String grade="NC";
    
    public static String[] questions={
    "3, 1, 4, 1, 5",
    "1, 1, 2, 3, 5",
    "1, 4, 9, 16, 25",
    "2, 3, 5, 7, 11",
    "1, 2, 4, 8, 16","last"
    };
    
    public static String[] hints={
    "pi",
    "fibonacci",
    "squares",
    "primes",
    "powers of 2","last"
    };
    
    public static int[] answers={9, 8, 36, 13, 32,-1};
    
    public int getScore(){
    return score;
    }
    
    public void incrementScore(){
    score++;
    }
    
    public int getCount(){
    return count;
    }
    
    public int getTries(){
    return tries;
    }
    
    public void resetTries(){
    tries = 3;
    }
    
    public void decrementTries(){
    tries--;
    }
    
    
    public void incrementCount(){
    count++;
    }
    
    public static String[] getQuestions(){
        return questions;
    }
    
    public static String[] getHints(){
    return hints;
    }
   public void calculateScore(int numTryLeft){
        switch (numTryLeft) {
            case 3:
                score+=10;
                break;
            case 2:
                score+=5;
                break;
            case 1:
                score+=2;
                break;
            default:
                break;
        }
   }
   
   public String getFinalGrade(){
       if(score>=45 && score<=50){
        grade="A";
       }
       if(score>=35 && score<=44){
        grade="B";
       }
       if(score>=25 && score<=34){
        grade="C";
       }
       
       return grade;
   }
}
