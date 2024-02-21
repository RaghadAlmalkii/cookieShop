/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookieshop1;
import java.util.*;

public class AllDrivers {

	ArrayList<Driver> allDrivers ;
	static int numberOfDrivers=0;  
	Scanner keyBoard=new Scanner(System.in);
	
	
	public AllDrivers() { //!!
		
	}

	
    
	
    public void addToAllDrivers(Driver d){
    	allDrivers = new ArrayList<Driver>();
        allDrivers.add(d);
        numberOfDrivers++;
    }
	
	
    public void displayAllDrivers(){
        for(int i=0; i<allDrivers.size();i++){
            System.out.print((i+1) + "- ");
            System.out.println( "Full name: "+ allDrivers.get(i).getFname()+" " +allDrivers.get(i).getLname()+ " Phone number: " + allDrivers.get(i).getPhone()  );
            System.out.println();
        }
    }
	
	
	
	
	
}