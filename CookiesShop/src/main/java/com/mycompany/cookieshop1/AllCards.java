/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
public class AllCards {
	
    static Card[] paymentMethods = new Card[5];
    static int numOfCards=0;
    
    
    public AllCards(){
        
    }
    
    public void addToPaymenthMethods(Card d){
       numOfCards++;
       paymentMethods[numOfCards] = new Card();
       paymentMethods[numOfCards] = d;
      
    }
    
 
    	
    
    public void ToString(){
       for(int i=1; i<numOfCards && i>0 ; i++){
           System.out.print(i + "-");
           paymentMethods[i].toString();
           System.out.println();
       }
    }


}