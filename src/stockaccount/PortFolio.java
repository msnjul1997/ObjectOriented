package stockaccount;

public class PortFolio extends Stock implements IStockCalculation {


    static float stockVal;
    static int t;
	private Stock[] arrayOfStock;

    public PortFolio(String nameOfStock, int numberOfShares, float sharePrice,int t) {
        super(nameOfStock, numberOfShares, sharePrice);
        this.t = t;
    }


    @Override
    public void stockCalculation(String nameOfStock, int numberOfShares, float sharePrice) {
        stockVal = numberOfShares*sharePrice;
        System.out.println("The total stock value of "+nameOfStock+" is "+stockVal);


    }
    public void stockPortfolio()
    {
        System.out.println("All the details of stock are as follows");
        for(Stock s:arrayOfStock)
        {
            System.out.println(s);
        }

    }
}
