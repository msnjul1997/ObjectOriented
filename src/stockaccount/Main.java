package stockaccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	 static String nameOfStock;
	    static int numberOfShares;
	    static float sharePrice;
	    static int t;
	    static ArrayList<Stock> arrayOfStock = new ArrayList<>(t);
	    public static void main(String[] args) {

	        System.out.println("Welcome to Stock account management system!");

	        Scanner sc = new Scanner(System.in);
	        PortFolio sp = new PortFolio(nameOfStock,numberOfShares,sharePrice,t);
	        System.out.println("Enter the number of stocks you want to store :");
	        t = sc.nextInt();


	        while(t>0) {
	            System.out.println("Enter the name of stock");
	            nameOfStock = sc.next();
	            System.out.println("Enter the number of shares");
	            numberOfShares = sc.nextInt();
	            System.out.println("Enter the share price");
	            sharePrice = sc.nextFloat();
	            Stock s = new Stock(nameOfStock, numberOfShares, sharePrice);
	            arrayOfStock.add(s);
	            sp.stockCalculation(nameOfStock,numberOfShares,sharePrice);
	            t--;
	        }


	        sp.stockPortfolio();
	    }
	}
	interface IStockCalculation{
	    void stockCalculation(String nameOfStock,int numberOfShares,float sharePrice);
	}


