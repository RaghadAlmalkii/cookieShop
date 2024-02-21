/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cookieshop1;
import java.util.*;

public class CookieShop1 {

	public static void main(String[] args) {
		
		Scanner keyBoard=new Scanner(System.in);
        
	       AllCarts allCarts= new AllCarts();
	       Cart cart = new Cart();
	       AllCards paymentMethods = new AllCards();
	       Account account = new Account();
	       AllReviews allReviews= new AllReviews();
	       
	       Driver driver1 = new Driver("Ahmad","khaled",0555);      //all the Drivers
	       Driver driver2 = new Driver("Abdullah","mohammed",0532);
	       
	       AllDrivers allDrivers = new AllDrivers();
	       allDrivers.addToAllDrivers(driver1);
	       allDrivers.addToAllDrivers(driver2);
	    		  
	       
	        int choice1;
	        do{
	       System.out.println(" welcome to Cookie Shop how can we help you!");
	       System.out.println("       1- logIn as costmer   2- logIn as manager  3-logIn as Driver  4-exit program");
	       int choice;
	         choice1 = keyBoard.nextInt(); 
	       
	       
	        if(choice1==1){
	        	
	       
	       System.out.println(" CREATE ACCOUNT ");
	       System.out.println("enter your first name ");
	       String f = keyBoard.next();
	       System.out.println("enter your last name ");
	       String l = keyBoard.next();
	       System.out.println("enter your phone number ");
	       int p = keyBoard.nextInt();
	       System.out.println("enter your email ");
	       String e = keyBoard.next();
	       
	       
	       account.updateAccount(f, l, e,p);
	       cart.setAccount(account); //cart has account
	       
	       
	        	
	        
	       
	        do{
	       System.out.println(
	"1- Add a cookie to cart\n" +
	"2- view cart\n" +
	"3- cancel a cart\n"+
	"4- manage my account\n"+
	"5- add a review for our CooKie Shop\n"+
	"6- log out\n");
	       
	       choice = keyBoard.nextInt();
	       

	    switch(choice){
	        
	    case 1: 
	    		System.out.println("pick a flavor");
	    	    System.out.print(
	    	            "1- Chocolate Chip Cookies\n"+
	    	            "2- Sugar Cookies\n"+
	    	            "3- RedVelvet Cookies\n"+
	    	            "4- white chocolate Cookies\n"+
	    	            "5- peanut butter Cookies\n"+
	    	            "6- Oatmeal Cookies\n");
	    	    int flavorChoice = keyBoard.nextInt();
	    	        
	    	    outer_loop:
	    	        switch(flavorChoice){
	    	            case 1: System.out.println("how many?");
	    	            Cookies ChocolateShipCookie= new Cookies("Chocolate Chip Cookies", keyBoard.nextInt());
	    	            cart.addToCart(ChocolateShipCookie); //cart has cookie
	    	            allCarts.addToAllCart(cart);
	    	            System.out.println("       your Chocolate Chip Cookies is added to cart!");
	    	            break;
	    	            
	    	             
	    	            case 2: System.out.println("how many?");
	    	            Cookies SugaCookies= new Cookies("Sugar Cookies", keyBoard.nextInt());
	    	            cart.addToCart(SugaCookies);
	    	            allCarts.addToAllCart(cart);
	    	            System.out.println("       your Sugar Cookies is added to cart!");
	    	            break ;
	    	            
	    	            case 3:  System.out.println("how many?");
	    	            Cookies redVelvet= new Cookies("RedVelvet Cookies", keyBoard.nextInt());
	    	            cart.addToCart(redVelvet);
	    	            allCarts.addToAllCart(cart);
	    	            System.out.println("       your RedVelvet Cookies is added to cart!");  
	    	            break ;
	    	            
	    	            case 4:  System.out.println("how many?");
	    	            Cookies whiteChocolateCookies= new Cookies("white chocolate Cookies", keyBoard.nextInt());
	    	            cart.addToCart(whiteChocolateCookies);
	    	            allCarts.addToAllCart(cart);
	    	            System.out.println("    your white chocolate Cookies is added to cart!");  
	    	            break ;
	    	            
	    	            case 5:  System.out.println("how many?");
	    	            Cookies peanutButterCookies= new Cookies("peanut butter Cookies", keyBoard.nextInt());
	    	            cart.addToCart(peanutButterCookies);
	    	            allCarts.addToAllCart(cart);
	    	            System.out.println("   your peanut butter Cookies is added to cart!");  
	    	            break ;
	    	            
	    	            case 6:  System.out.println("how many?");
	    	            Cookies OatmealCookies= new Cookies("Oatmeal Cookies", keyBoard.nextInt());
	    	            cart.addToCart(OatmealCookies);
	    	            allCarts.addToAllCart(cart);
	    	            System.out.println("   your Oatmeal Cookies is added to cart!");  
	    	            break ;
	    	        }//inner switch
	    		
	    		
	    	
	    	
	    	
	    	
	        break;  //main switch
	 
	         
	    case 2: 
	    		cart.toString();
	    	    System.out.print("       chick out?\n"+"       1-Yes     2-No\n");
	    	    int YesOrNo = keyBoard.nextInt();
	    	    if(YesOrNo==1){
	    	        System.out.println("How do you want to pay? \n   1-Set new card     2-Choose from my previouse cards \n ");
	    	        int c = keyBoard.nextInt();
	    	        if (c==1) {
	    	        	Card card = new Card();
	    	 	       System.out.println("enter the name that is written in the card (use _ for spaces) ");
	    	 	       String name = keyBoard.next();
	    	 	       System.out.println("enter card number ");
	    	 	       int number = keyBoard.nextInt();
	    	 	       System.out.println("enter card date ( use / ) ");
	    	 	       String date = keyBoard.next();
	    	 	       System.out.println("enter card code ");
	    	 	       int code = keyBoard.nextInt();
	    	 	       card.addCard(name, number, date, code);

	    	 	       
	    	 	           
	    	        }else {
	    	        	paymentMethods.ToString();
	    	        	cart.selectCard(keyBoard.nextInt());

	    	        }
	    	        	
	    	        	
	    	        System.out.println("fill your dilevry address information");
	    	        System.out.println("City? ");
	    	        String city = keyBoard.next();
	    	        System.out.println("street? ");
	    	        String street = keyBoard.next();
	    	        System.out.println("Bulding Number? ");
	    	        int buldingNum = keyBoard.nextInt();
	    	        Address adressInfo = new Address(city,street,buldingNum);
	    	        cart.setAddress(adressInfo);
	    	        cart.setGotPaied(true);
	    	        
	    	                                                                 //Driver 
	    	        
	    	       
	    	       System.out.print("pick a driver \n" + 
	    	                           "1 - Ahmad khaled \n "+
	    	                           "2 - Rem mohammed\n ");
	    	        int driverChoice = keyBoard.nextInt();    
	    	        
	    	        
	    	         System.out.println(                 "THANK YOU!\n"+
	    	                                      " your order is placed\n"); 
	    	       
	    	        if(driverChoice == 1){
	    	            System.out.println("rate the driver\n"+
	    	                         		" 1-  Perfect" +
	    	                                " 2- good" + 
	    	                                " 3- bad"
	    	                                       );
	    	            driver1.rate(keyBoard.nextInt());	
	    	            cart.setDriver(driver1);
	    	        	
	    	        
	    	        }
	    	          else{
	    	              System.out.println("rate the driver\n"+
	    	                        		 "1 - Perfect" +
	    	                                 "2 - good " + 
	    	                                 "3 - bad"
	    	                                        );
	    	            driver2.rate(keyBoard.nextInt());
	    	            cart.setDriver(driver2);
	    	        	
	    	            System.out.println();
	    	            
	    	        }
	    	        break;
	    	    }
	    		
	    	
	    	
	    break; //main switch
	    
	    
	    case 3: 
	         allCarts.CancelCart(cart);
	         
	         break;
	     
	     
	    case 4:
	        System.out.println(" 1- update account ?        2- add new payment method?");
	        choice = keyBoard.nextInt();
	       if(choice ==1){
	       System.out.println("enter your first name ");
	       String fn = keyBoard.next();
	       System.out.println("enter your last name ");
	       System.out.println("enter your phone number ");
	       int ph = keyBoard.nextInt();
	        String ln = keyBoard.next();
	       System.out.println("enter your email ");
	        String em = keyBoard.next();
	       
	        account.updateAccount(fn, ln, em,ph);
	       System.out.println("your account has been updated"); }
	       
	       else{
	           Card card = new Card();
	       System.out.println("enter the name that is written in the card (use _ for spaces) ");
	       String name = keyBoard.next();
	       System.out.println("enter card number ");
	       int number = keyBoard.nextInt();
	       System.out.println("enter card date ( use / ) ");
	       String date = keyBoard.next();
	       System.out.println("enter card code ");
	       int code = keyBoard.nextInt();
	       card.addCard(name, number, date, code);
	       paymentMethods.addToPaymenthMethods(card);
	           
	       }
	      
	       break;
	       
	    case 5:  
	         System.out.println("rate the shop\n"+ 
	                               "1- * " +
	                               "2- ** " + 
	                               "3- *** "
	                                 );
	            account.rate(keyBoard.nextInt());
	            
	         System.out.print("add your comment(use _ for spaces)");
	         account.addComment(keyBoard.next());
	         
	         System.out.println("your review has been sent \n");
	         
	         account.addReview();
	         
	         break;
	}        
	      }while(choice != 6); }//customer logout
	        
	        
	   

	        else if(choice1 == 2){  //manager logIn

	do{
	System.out.println("welcomeBack!, Choose from the list");
	            System.out.print(
	"1- view all orders\n" +
	"2- view Canceled orders\n" +
	"3- view Delivered orders\n" +
	"4- view costmer reviews\n"+
	"5- veiw drivers rating\n"+
	"6- view all Drivers\n"+
	"7- logOut");
	choice = keyBoard.nextInt();

	switch(choice){
	    case 1: allCarts.displayAllCarts();
	        break;
	    case 2: allCarts.displayCanceledCarts();
	        break;
	    case 3: allCarts.displayDeliverCart();
	        break;
	    case 4: allReviews.displayAllReviews();
	        break;
	    case 5: driver1.displayRating(); 
	            driver2.displayRating();
	        break;
	    case 6: 
        allDrivers.displayAllDrivers(); //to display all drivers
        break;
	    
	}
	        }while(choice != 7); }
	        
	        //Driver section
	        
	        else if(choice1 == 3) {  //Driver logIn
	        	
	        	do {
	        		
	        		
	        		System.out.println("welcomeBack!, Choose from the list");
		            System.out.print(
		"1- view order\n" +
		"2- Delivere order\n" +
		"3- view costmer rating\n" +
		"4- logOut");
		
		choice = keyBoard.nextInt();
	        		
		switch(choice) {
		
    case 1: cart.displayOrder();
        break;
    case 2: allCarts.deliverCart(cart);
        break;
    case 3: cart.displayCustomerRating();
        break;
    
		}
	       		
	        	}while(choice!=4); }//Driver logOut
	        	
	        
	        }while(choice1 !=4);
	    }//main
	    
	    
	}//class