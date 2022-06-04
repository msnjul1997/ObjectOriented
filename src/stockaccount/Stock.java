package stockaccount;

public class Stock {
	 private String nameOfStock;
	    private int numberOfShares;
	    private float sharePrice;
	    public Stock(String nameOfStock,int numberOfShares,float sharePrice)
	    {
	        this.nameOfStock = nameOfStock;
	        this.numberOfShares = numberOfShares;
	        this.sharePrice=sharePrice;
	    }
	    public String toString()
	    {
	        return "Stock Portfolio of the given stock are \n Name :"+nameOfStock+" \n Number Of Shares :"+numberOfShares+" \n Share Price "+sharePrice;
	    }

}
