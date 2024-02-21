/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
public class Cart {
	
    Cookies[] cart = new Cookies[5];
    static int cookiesInCart=0;
    private Driver driver;
    private Account account;
    private Address address;
    private boolean gotPaied;
    private Card payment;
    
    
   public Cart(){
         this.gotPaied=false;
}
   
   
   public Cart (Cookies[] c, Driver d, Account a, Address ad,Card pa,boolean gp) {
	   this.cart=c;
	   this.driver=d;
	   this.account=a;
	   this.address=ad;
	   this.payment=pa;
	   this.gotPaied=gp;
	   
	   
   }
   
  
   
   public Cart(Cookies c){
	   cookiesInCart++;
       cart[cookiesInCart] = new Cookies();
       cart[cookiesInCart] =c;
       
       
   }
   
   public void addToCart(Cookies c){
	   cookiesInCart++;
       cart[cookiesInCart] = new Cookies();
       cart[cookiesInCart] =c;
       
   }
   
   public void displayOrder() {
   	System.out.println("Full name: " + this.account.getFName() + " " + this.account.getLName() + " Phone number: " + this.account.getPhone() + " " + this.address );
   	cart.toString();
   	System.out.println();
   	
   	
   }
   
   public void displayCustomerRating(){
       System.out.println(getAccount().getFName() + " " + getAccount().getLName() + " , Rating: " + this.driver + "\n");
       
}
   
   
   
   
   public String toString(){
       for(int i=1; i<=this.cookiesInCart && i>0 ; i++){
          System.out.print(i + " - ");
          cart[i].toString();
          System.out.println();
          
       } return null;
    }
   
   
   public void selectCard(int c) {  //Here
   	for(int i =0;i<=AllCards.numOfCards;c++) {
   		if(c==i) {
   			this.payment=AllCards.paymentMethods[i];
   		}
   	}
   }
   
   public String getCookieflavor(){ //in cookies class
   for(int i=0; i<cart.length; i++){
    return cart[i].getFlavor();
}
   return null;
   }
   
   public int getCookieQuantity(){ //in cookie class
   int q=0;
   for(int i=0; i<cart.length; i++){
   q = cart[i].getQuantity();
}
   return q;
   }
   
   public Cookies[] getCart(){
   return cart;
}
   
   
   
   public void setDriver(Driver d){
       this.driver=d;
   }
   
   public Driver getDriver() {
  	 return driver;
  	 
   }
   
   public void setAccount(Account a){
       this.account=a;
   }
   
   public Account getAccount() {
  	 return account;
  	 
   }
   
   public void setAddress(Address a){
       this.address=a;
   }
   
   public Address getAddress() {
  	 return address;
  	 
   }
   
   public void setPayment(Card c){
       this.payment=c;
   }
   
   public Card getPayment() {
  	 return payment;
  	 
   }
   
   public void setGotPaied(boolean g){
       this.gotPaied=g;
   }
   
   public boolean getGotPaied() {
  	 return gotPaied;
  	 
   }
   
  
   
   
   
   
   
   


}