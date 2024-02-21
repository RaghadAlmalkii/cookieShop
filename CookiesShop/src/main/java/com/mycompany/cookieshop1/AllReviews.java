/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
public class AllReviews {
	
    static  Account[] reviews = new Account[5] ;   
    static int numberOfReviews=0;
    
    public AllReviews(){
    	
        
    }
    
    
    public void addToAllComments(Account a){
    	reviews[numberOfReviews] = a;
    	numberOfReviews++;
    }
    
    public void displayAllReviews(){
   for(int i=1;i<=numberOfReviews;i++){
	   
	System.out.println();   
	System.out.print(i); 
	System.out.print("- ");
	System.out.print(reviews[i].getFName()+ " " + reviews[i].getLName());
    System.out.print(" : ");
    System.out.print(reviews[i].getComment());
    System.out.println();
    reviews[i].displayRating();
    
    
    
   }
}


}