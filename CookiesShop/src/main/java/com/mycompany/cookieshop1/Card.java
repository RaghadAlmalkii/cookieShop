/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
import java.util.*;
	
	public class Card {
	      private String name;
	      private int cardNumber;
	      private String date;
	      private int code;
	      
	      
	      Card(){
	          
	      }
	      
	      Card(String name, int cardNumber, String date, int code){
	          this.name=name;
	          this.cardNumber=cardNumber;
	          this.date=date;
	          this.code=code;
	      }
	      
	      
	    public String getName(){
	        return name ;
	    }
	    
	    public int getLCardNumber(){
	        return cardNumber ;
	    }
	    
	    public void getdate(){
	        System.out.print(date);
	    }
	    public int getcode(){
	       return code;
	    }
	    
	    
	      
	      public void addCard(String name, int cardNumber, String date, int code){
	          this.name = name;
	          this.name=name;
	          this.cardNumber=cardNumber;
	          this.date=date;
	          this.code=code;
	      }
	      
	      
	      public String toString(){
	        System.out.print("Name on card: "+ name +" card number : "+cardNumber+" date: "+date);
	        return null;
	    }


}