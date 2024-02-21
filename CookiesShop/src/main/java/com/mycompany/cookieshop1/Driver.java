/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
public class Driver implements Rate {
	
    private String firstName ;
    private String lastName;
    private int phone;
    private String rating;
  

    
    public Driver() {
    	
    	
    }
    
    
    
    public Driver(String firstName, String lastName, int phone){
        this.firstName=firstName;
        this.lastName=lastName;
        this.phone=phone;
       
    }
    
    
    
  
    
    
    
    
    
    public void rate(int n){ 
        if(n == 1) {
       	  this.rating = ("Perfect");
          System.out.println("Happy to serve you!");
      }
      else if (n==2){
          this.rating= ("Good");
      System.out.println("I will try my best"); 
   }
          else { 
            this.rating= ("Bad");
          System.out.println("Sorry, I will improve my service");
                  }

    }
    
   
    
    
    
        public void displayRating(){
            System.out.println(this.firstName + " " + this.lastName + " , Rating: " + this.rating + "\n");
            
    }
        
       
        
        
        
        public void setFname(String f){
            this.firstName=f;
        }
        
        public String getFname() {
       	 return firstName;
       	 
        }
        
        public void setLname(String l){
            this.lastName=l;
        }
        
        public String getLname() {
       	 return lastName;
       	 
        }
        
        public void setRating(String r){
            this.rating=r;
        }
        
        public String getRating() {
       	 return rating;
       	 
        }
        
        public void setPhone(int f){
            this.phone=f;
        }
        
        public int getPhone() {
       	 return phone;
       	 
        }
        
        
        
        
        
        
        
    
        
   
    }
    
    
    
    
