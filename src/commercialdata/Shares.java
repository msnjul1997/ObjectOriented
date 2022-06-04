package commercialdata;

import java.util.Date;

public class Shares {
	  String stockSymbol;
	     int numberOfShares;
	     Date time;
	    public Shares(String stockSymbol, int numberOfShares, Date time)
	    {
	        this.stockSymbol = stockSymbol;
	        this.numberOfShares = numberOfShares;
	        this.time=time;
	    }

	    public String toString()
	    {
	        return "Stock Portfolio of the given stock are \n Stock Symbol :"+stockSymbol+" \n Number Of Shares :"+numberOfShares+" \n Time of Transaction "+time;
	    }

}
