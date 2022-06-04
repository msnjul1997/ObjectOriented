package objectorientedprogram;

public class Debit extends AccDetails {
	 public void checkBalance(float balance,float withdraw)
	    {
	        if(balance<withdraw)
	        {
	            System.out.println("Debit amount exceeded account balance.");
	        } else if (balance>=withdraw) {
	            float remainingAmount = balance - withdraw;
	            System.out.println("Withdrawal of amount "+withdraw+" was successfully completed \nYour current balance is :"+remainingAmount);
	        }

	    }

}
