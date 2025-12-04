/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaneb
 */
public class Storage {
    
    private String[] Colours = {"red","blue","green","black","white","yellow","grey","purple","pink","brown","teal"};
    
    private Question q1 = new Question("In OOP, inheritance allows a class to acquire properties and methods from another class.",true);
    private Question q2 = new Question("A binary search algorithm can only be applied to a sorted list or array.",true);
    private Question q3 = new Question("In relational databases, SQL stands for Structured Query Language.",true);
    private Question q4 = new Question("The Big-O notation  describes an algorithm whose runtime doubles when the input size doubles.",false);
    private Question q5 = new Question("In computer networks, TCP is a connection-oriented protocol, while UDP is connectionless.",true);
    private Question q6 = new Question("A compiler translates high-level source code into machine code, while an interpreter executes code line by line.",true);
    private Question q7 = new Question("SQL is used for databases.", true);
    private Question q8 = new Question("IPv4 addresses are 32 bits long.", true);
    private Question q9 = new Question("Git is a distributed version control system.", true);
    private Question q10 = new Question("CSS stands for Cascading Style Sheets.", true);
    private Question q11 = new Question("UDP guarantees packet delivery.", false);
    private Question q12 = new Question("A queue uses FIFO order.", true);
    private Question q13 = new Question("The JVM makes Java platform-independent.", true);
    private Question q14 = new Question("DNS translates domain names to IP addresses.", true);
    private Question q15 = new Question("Merge Sort is slower than Bubble Sort.", false);



    private Question[] questions = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15};
    
    public Question[] getQuestions(){
        return questions;
    }
    public String[] getColours(){
        return Colours;
    }
}
