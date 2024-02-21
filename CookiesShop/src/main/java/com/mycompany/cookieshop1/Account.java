
package com.mycompany.cookieshop1;
public class Account implements Rate {
	
	private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private String comment;
    private String rating;
    
    
    Account(){
      
    }
    
    Account(String firstName, String lastName, String email, int ph){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone=ph;
        
        
    }
    
    
    public void rate(int n){ 
        if(n == 1) {
       	  this.rating = "*";
          System.out.println("Sorry, I will improve my service");
      }
      else if (n==2){
          this.rating= "**";
      System.out.println("I will try my best"); 
   }
          else { 
            this.rating= "***";
          System.out.println("Happy to serve you!");
                  }

    }
    
    
    
    
        public void displayRating(){
            System.out.println("   Rating: " + rating + "\n");
            
    }
        
        
   
    
    public void addComment(String c){
        this.comment = c;
       
    }
    
    
    public void addReview() {
    	AllReviews.numberOfReviews++;
    	AllReviews.reviews[AllReviews.numberOfReviews]=new Account();
        AllReviews.reviews[AllReviews.numberOfReviews].comment=this.comment;
        AllReviews.reviews[AllReviews.numberOfReviews].rating=this.rating;
        AllReviews.reviews[AllReviews.numberOfReviews].firstName=this.firstName;
        AllReviews.reviews[AllReviews.numberOfReviews].lastName=this.lastName;
        AllReviews.reviews[AllReviews.numberOfReviews].email=this.email;
    	
    	
    }
    
    public void updateAccount(String firstName, String lastName, String email, int ph){
         this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone=ph;
       
    }
    
    public String getFName(){
        return firstName ;
    }
    
    public String getLName(){
        return lastName;
    }
    
    public String getComment(){
        return comment;
    }
    public void setFName(String f){
       firstName = f;
    }
    
    public void setLName(String l){
       lastName = l;
    }
    
    public void setPhone(int f){
        this.phone = f;
     }
     
     public int getPhone(){
        return phone;
     }
    
    


}