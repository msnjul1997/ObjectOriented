package commercialdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StockAccount {
	String fileName;
    public StockAccount(String fileName)
    {
        this.fileName = fileName;
    }
    static String stockSymbol;
    static int numberOfShares;
    static Date time;
    static ArrayList<Shares> arrayOfCompanyShares;

    public static void main(String[] args) {
        arrayOfCompanyShares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name ");
        stockSymbol = sc.next();
        System.out.println("Enter the number of shares ");
        numberOfShares = sc.nextInt();
        time = new Date();

        Shares cs = new Shares(stockSymbol,numberOfShares,time);
        arrayOfCompanyShares.add(cs);
        Transaction t = new Transaction(stockSymbol,numberOfShares,time);
        System.out.println("Enter the share symbol you wish to buy");
        String buyShare = sc.next();
        System.out.println("Enter the amount you want to buy of the share");
        int amount = sc.nextInt();
        t.buy(amount,buyShare);
        System.out.println("Enter the share symbol you wish to sell");
        String sellShare = sc.next();
        System.out.println("Enter the amount you wish to sell of the share");
        int amountSell = sc.nextInt();
        t.sell(amountSell,sellShare);
        t.printReport();
    }
}
interface ITransaction{
    double valueOf();
    void buy(int amount, String symbol);
    void sell(int amount, String symbol);
    void save(String filename);
    void printReport();

}

