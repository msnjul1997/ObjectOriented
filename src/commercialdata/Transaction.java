package commercialdata;

import java.util.Date;

public class Transaction extends Shares implements ITransaction{

    private Shares[] arrayOfShares;

	public Transaction(String stockSymbol, int numberOfShares, Date time) {
        super(stockSymbol, numberOfShares, time);
    }

    @Override
    public double valueOf() {
        return 0;
    }

    @Override
    public void buy(int amount, String symbol) {
        if(amount>numberOfShares)
        {
            System.out.println("The shares are not sufficient");
        }
        else {
            numberOfShares-=amount;
            time = new Date();
            System.out.println("You bought " + amount + " worth of shares of " + symbol);
        }

    }

    @Override
    public void sell(int amount, String symbol) {
        numberOfShares+=amount;
        time = new Date();
        System.out.println("You sold "+amount+" worth of shares of "+symbol);
    }

    @Override
    public void save(String filename) {

    }

    @Override
    public void printReport() {
        for(Shares cs : arrayOfShares)
        {
            System.out.println(cs);
        }
    }
}

