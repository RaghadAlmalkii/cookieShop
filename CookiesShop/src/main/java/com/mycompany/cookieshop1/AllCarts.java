/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
import java.util.*;

public class AllCarts {
	
	Scanner keyBoard=new Scanner(System.in);
    Cart[] allCarts = new Cart[5];
    static int numberOfCart=0; //static
    
    
    public AllCarts(){

}
    
  

public void addToAllCart(Cart c){
	allCarts[numberOfCart]=new Cart();
    allCarts[numberOfCart]=c;
    numberOfCart++;
}


public void CancelCart(Cart a){ //poly
    
    for(int i=0; i<numberOfCart; i++){
        if(allCarts[i].getAccount().getPhone()==a.getAccount().getPhone()) {
        	CanceledCarts c =  new CanceledCarts(a.getCart(), a.getDriver(), a.getAccount(), a.getAddress(), a.getPayment(), false);
        	allCarts[i] = c;
        }
           
            
      }
    
}


public void deliverCart(Cart a){ //poly
	for(int i=0; i<numberOfCart; i++){
        if(allCarts[i].getAccount().getPhone()==a.getAccount().getPhone()) {
        	DeliveredCarts c =  new DeliveredCarts(a.cart, a.getDriver(), a.getAccount(), a.getAddress(), a.getPayment(), false);
        	allCarts[i] = c;
        }
           
            
      }
	
	
	
}


public void displayCanceledCarts(){
	for(int i=0; i<numberOfCart;i++){
        if(allCarts[i] instanceof CanceledCarts)
        System.out.print((i+1)+"- ");
        System.out.println("Full name: " +allCarts[i].getAccount().getFName()  + " " + allCarts[i].getAccount().getLName() + " Phone number: " + allCarts[i].getAccount().getPhone() + " " + allCarts[i].getAddress().toString() );
       	System.out.println();
    }
}

public void displayDeliverCart(){
    for(int i=0; i<allCarts.length;i++){
        if(allCarts[i] instanceof DeliveredCarts){
        allCarts[i].toString();
        System.out.println();}
    }
}
        
public void displayAllCarts(){
    for(int i=0; i<numberOfCart;i++){
        if(allCarts[i] instanceof Cart)
        System.out.print((i+1)+"- ");
        allCarts[i].toString();
        System.out.println();
    }
}


}