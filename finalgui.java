package finalgui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class finalgui {

	private JFrame frame;
	private JTextField apple;
	private JTextField banana;
	private JTextField orange;
	private JTextField beer;
	private JTextField medicine;
	private JTextField wine;
	private JLabel prioritylbl;
	private String appleText;
	private String bananaText;
	private String sanitizerText;
	private String orangeText;
	private String beerText;
	private String medicineText;
	private String wineText;
	private JTextField sanitizer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalgui window = new finalgui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public finalgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		apple = new JTextField();
		apple.setBounds(10, 27, 20, 19);
		frame.getContentPane().add(apple);
		apple.setColumns(10);
		
		banana = new JTextField();
		banana.setBounds(10, 56, 20, 19);
		frame.getContentPane().add(banana);
		banana.setColumns(10);
		
		orange = new JTextField();
		orange.setColumns(10);
		orange.setBounds(10, 120, 20, 19);
		frame.getContentPane().add(orange);
		
		beer = new JTextField();
		beer.setColumns(10);
		beer.setBounds(10, 152, 20, 19);
		frame.getContentPane().add(beer);
		
		medicine = new JTextField();
		medicine.setColumns(10);
		medicine.setBounds(10, 181, 20, 19);
		frame.getContentPane().add(medicine);
		
		wine = new JTextField();
		wine.setColumns(10);
		wine.setBounds(10, 210, 20, 19);
		frame.getContentPane().add(wine);

		JLabel applelbl = new JLabel("apple $10");
		applelbl.setBounds(40, 33, 74, 13);
		frame.getContentPane().add(applelbl);
		
		JLabel bananalbl = new JLabel("banana $10");
		bananalbl.setBounds(40, 59, 74, 13);
		frame.getContentPane().add(bananalbl);
		
		JLabel sanitizerlbl = new JLabel("sanitizer $40");
		sanitizerlbl.setBounds(40, 88, 74, 13);
		frame.getContentPane().add(sanitizerlbl);
		
		JLabel orangelbl = new JLabel("orange $20");
		orangelbl.setBounds(40, 117, 74, 13);
		frame.getContentPane().add(orangelbl);
		
		JLabel beerlbl = new JLabel("beer $5");
		beerlbl.setBounds(40, 152, 74, 13);
		frame.getContentPane().add(beerlbl);
		
		JLabel medicinelbl = new JLabel("medicine $15");
		medicinelbl.setBounds(40, 181, 74, 13);
		frame.getContentPane().add(medicinelbl);
		
		JLabel winellbl = new JLabel("wine $20");
		winellbl.setBounds(40, 213, 60, 13);
		frame.getContentPane().add(winellbl);
		
		prioritylbl = new JLabel("Enter priority 1-7");
		prioritylbl.setBounds(10, 10, 104, 13);
		frame.getContentPane().add(prioritylbl);
		
		JButton done = new JButton("Done");
		done.setBounds(10, 239, 85, 21);
		frame.getContentPane().add(done);
		
		sanitizer = new JTextField();
		sanitizer.setBounds(10, 85, 20, 19);
		frame.getContentPane().add(sanitizer);
		sanitizer.setColumns(10);
		
		
		
		
		//for loop entering the data into an array...then bubble sort
	/*	
	*/	
		
		
		
	//Welcome the user 	
		System.out.println("Please enter your name and hit enter");
		@SuppressWarnings("resource")
		Scanner name = new Scanner(System.in);
		String username = name.next();
		username = username.replaceAll("[^a-zA]", "");
		System.out.println("Welcome to to the market " + username);
		
		
		
		
		
	//button action
		done.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			
				
			
				
			//set up variablesstrings	
				String[][] shoppingList = new String[7][2];
				
				int[] quantity = new int[7];
				
				int[] prices = new int[7];
				
		    	int totalPrices= prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6];	
		    	
		    	String[] purchased = new String [7];
		    	
		    	String[] notPurchased = new String [7];
				
				String apples = "apple";
				String bananas = "banana";
				String sanitizers = "sanitizer";
				String oranges = "orange";
				String beers = "beer";
				String medicines = "medicine";
				String wines = "wine";
				
				appleText = (apple.getText());	
				bananaText = (banana.getText());
				sanitizerText = (sanitizer.getText());
				orangeText = (orange.getText());
				beerText = (beer.getText());
				medicineText = (medicine.getText());
				wineText = (wine.getText());
				
			
			
				
					
					shoppingList[0][0] = apples;
					shoppingList[0][1] = appleText;
					shoppingList[1][0] = bananas;
					shoppingList[1][1] = bananaText;
					shoppingList[2][0] = sanitizers;
					shoppingList[2][1] = sanitizerText;
					shoppingList[3][0] = oranges;
					shoppingList[3][1] = orangeText;
					shoppingList[4][0] = beers;
					shoppingList[4][1] = beerText;
					shoppingList[5][0] = medicines;
					shoppingList[5][1] = medicineText;
					shoppingList[6][0] = wines;
					shoppingList[6][1] = wineText;
				
				
					
			//get budget	
				System.out.println("What is your budget?");				
				Scanner account = new Scanner(System.in);	
				int bankAccount = account.nextInt();
						
					
					
			//bubblesort class
				bubblesort bubble = new bubblesort();
				bubble.bubbleSort(shoppingList);
				            
				  
				        
				        
				    //print the array   
				    	@SuppressWarnings("resource")
				   
				    	Scanner quant = new Scanner(System.in);
						
				    	for (int i=0; i<quantity.length; i++) {
				    		System.out.println("enter quantity");
				    		System.out.println(Arrays.toString(shoppingList[i]));
				    		quantity[i]=quant.nextInt();
				    	}
				    	
				    	
				    	
				    	
				    	
				    	
				    	
				    	
				    	
				    	
				    //item checker	
						for (int i=0; i<shoppingList.length; i++) {
				    		if (shoppingList[i][0].equals("banana")) {
				    			prices[i]=10*quantity[i];	
				    			totalPrices= prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6];
				    				if (totalPrices<= bankAccount ) {
				    					purchased[i]="banana";
				    				}
				    				if (totalPrices>=bankAccount) {
				    					notPurchased[i]= "banana";
				    				}
				    			
				    			}
				    			
				    		if (shoppingList[i][0].equals("apple")) {
				    			prices[i]=10*quantity[i];	
				    			totalPrices= prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6];	
				    			if (totalPrices<= bankAccount) {
				    				purchased[i]="apple";
				    			}
				    			if (totalPrices>=bankAccount) {
				    				notPurchased[i]= "apple";
				    			}
				    			}
				    		if (shoppingList[i][0].equals("sanitizer")) {
				    			prices[i]=40*quantity[i];	
				    			totalPrices= prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6];	
				    			if (totalPrices<= bankAccount) {
				    				purchased[i]="sanitizer";
				    			}
				    			if (totalPrices>=bankAccount) {
				    				notPurchased[i]= "sanitizer";
				    			}
				    			}
				    		if (shoppingList[i][0].equals("orange")) {
				    			prices[i]=20*quantity[i];	
				    			totalPrices= prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6];	
				    			if (totalPrices<= bankAccount) {
				    				purchased[i]="orange";
				    			}
				    			if (totalPrices>=bankAccount) {
				    				notPurchased[i]= "orange";
				    			}
				    			
				    			}
				    		if (shoppingList[i][0].equals("beer")) {
				    			prices[i]=5*quantity[i];	
				    			totalPrices= prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6];	
				    			if (totalPrices<= bankAccount) {
				    				purchased[i]="beer";
				    			}
				    			if (totalPrices>=bankAccount) {
				    				notPurchased[i]= "beer";
				    			}
				    			}
				    		if (shoppingList[i][0].equals("medicine")) {
				    			prices[i]=15*quantity[i];	
				    			totalPrices= prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6];	
				    			if (totalPrices<= bankAccount) {
				    				purchased[i]="medicine";
				    			}
				    			if (totalPrices>=bankAccount) {
				    				notPurchased[i]= "medicine";
				    			}
				    			}
				    		if (shoppingList[i][0].equals("wine")) {
				    			prices[i]=20*quantity[i];
				    			totalPrices= prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6];	
				    			if (totalPrices<= bankAccount) {
				    				purchased[i]="wine";
				    			}
				    			if (totalPrices>=bankAccount) {
				    				notPurchased[i]= "wine";
				    			}
				    			}
				    	}
				    	
				    	
				    //prints the string[][] 	
				    	
				    	 for(int i=0; i<shoppingList.length; i++)
							{
							    for(int j=0; j<2; j++)
							    {
							        System.out.print(shoppingList[i][j]+ "  ");
							    }
							    System.out.println();
							}
				    	
				    	
				    //Print the purchased list
				    	System.out.println("the items have the following prices: ");
				    	System.out.println(Arrays.toString(prices));
				    	System.out.println("total: " + totalPrices);
				    	System.out.println("since you have $"+ bankAccount +" int our bankAccount, you have purchased:");
				    	
				    //remove the nulls from the array
				    		for (int i=0; i<purchased.length; i++) {
				    			if (purchased[i]==null) {
				    				purchased[i] ="";
				    			}
				    		}
				    		
				    		
				    		
				    		printer2(purchased, prices);
				    			System.out.println("total:$ ");
				    		
				   
				    			
				    			
				    //display total price purchased
				    	
				    //Print the not purchased list
				    	System.out.println("You have not purchased the following items: ");

				    	for (int i=0; i<notPurchased.length; i++) {
				    		if (notPurchased[i]==null) {
				    			notPurchased[i] ="";
				    		}
				    	}
				}
			
			

					
					
					
					
					
		
		}
		);
		
		
		
	
		
		
		
	}
//print method
	 void printer2(String[] purchased, int[] prices) {
		
		for (int i=0; i<purchased.length; i++) {


			System.out.println(purchased[i]+ " $ " + prices[i]);
	}
}

		
	}
	

