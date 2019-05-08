
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
    private String grade="NC";
    private int tries=0;
    
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
    private String[] hints ={
        "Pi",
        "fibonaci",
        "squares",
        "primes" ,
        "power of 2" };
    
      public String getHint(){
      return hints[index];
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
      public int calculateScore(int tries){
   if(tries>0&& tries<=3){
   if(tries==1){
      score+=10;
   }
   if(tries==2) {
   score+=5;}  
       
     if(tries==3) {
   score+=2;}    
       }
   return score;
  }
  
  public String computeGrade(){
  String grade="NC";
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