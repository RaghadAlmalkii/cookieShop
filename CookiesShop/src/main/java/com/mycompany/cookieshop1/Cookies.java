/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
public class Cookies {
	
	private String flavor;
    private int quantity;
    private int price = 15;
   
   Cookies(){
       
   }
   
   Cookies(String flavor, int quantity){
       this.flavor = flavor;
       this.quantity = quantity ;
       price = 15 * quantity;
   }
   
   public String getFlavor(){
       return flavor;
   }
   public int getQuantity(){
       return quantity;
   }
   public void setFlavor(String f){
   flavor = f;
   }
   public void setQuantity(int q){
   quantity=q;
   }
   
   
   public String toString(){
       System.out.print("Flavor: "+ flavor +" Quantity : "+ quantity+" Total Price: "+ price);
       return null;
   }


}