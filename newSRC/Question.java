/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaneb
 */
public class Question {
    private String text;
    private boolean answer;
    
    public Question(String text , boolean answer){
        this.text = text;
        this.answer = answer;
    }
    public String getText(){
        return text;
    }
    public boolean getAnswer(){
        return answer;
    }
}
