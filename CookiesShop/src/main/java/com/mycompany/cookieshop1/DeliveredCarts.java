/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
public class DeliveredCarts extends Cart{
	
	
	
	public DeliveredCarts() {
		
		super();
	}
	
	
	public DeliveredCarts(Cookies[] c, Driver d, Account a, Address ad,Card pa,boolean gp){
	       super(c,d,a,ad,pa,gp);
	   } 
	  
	
	
	
    
	public String toString(){
	     for(int i=1; i<=this.cookiesInCart && i>0 ; i++){
	        System.out.print(i + " - ");
	        cart[i].toString();
	        System.out.println("Delieverd");
	        
	     } return null;
	  }
	 
	
	
	
}