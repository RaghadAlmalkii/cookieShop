/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
public class Address {
	
	private String city;
    private String street;
    private int buildingNum;
    
    public Address() {
    	
    }
    
    Address(String city, String street, int buildingNum){
    this.city=city;
    this.street=street;
    this.buildingNum=buildingNum;
    }
    
     public String toString(){
        return "city: "+ city +" street : "+street+" bulding number: "+buildingNum;
    }
     
     
     public void setCity(String c){
         this.city=c;
     }
     
     public String getCity() {
    	 return city;
    	 
     }
     
     public void setStreet(String s){
         this.street=s;
     }
     
     public String getStreet() {
    	 return street;
    	 
     }
     
     public void setBuilding(int b){
         this.buildingNum=b;
     }
     
     public int getBuilding() {
    	 return buildingNum;
    	 
     }
     
     
     
     
     
     
     
     
     


}
     
     
     
     
     
     
     
     



