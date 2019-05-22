/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

/**
 *
 * @author Kadjal
 */
public class Result {
     
    
    private String wordType;
    private String definition;
    
    public Result(String wordType, String definition ){
    this.wordType = wordType;
    this.definition = definition;
   }

    public String getWordType() {
        return wordType;
    }

    public String getDefinition() {
        return definition;
    }

    public void setWordType(String wordType) {
        this.wordType = wordType;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
    
    
}
