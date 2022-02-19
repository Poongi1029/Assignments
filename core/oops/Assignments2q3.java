import java.util.ArrayList;

public class Assignments2q3 {
	public int totalCashInBank(ArrayList<Integer> cash){
		int availbal=0;
		
		for(int i:cash) {
			availbal += 1;
		}
		
		return availbal;
	}
	public int getCash()
	{
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignments2q3 assignments2q3 = new Assignments2q3();
		
		CurrentAccount currentAccount = new CurrentAccount();
		int currentbal = currentAccount.getCash();
		
		SavingsAccount savingsAccount = new SavingsAccount();
		int savbal = savingsAccount.getCash();
		
		ArrayList<Integer> cash = new ArrayList<>();
        cash.add(currentbal);
        cash.add(savbal);

        System.out.println(assignments2q3.totalCashInBank(cash));
		

	}

}

class SavingsAccount extends Assignments2q3 {
	 int totalDeposits = 10000;
	 int fixedDepositAmount = 5000;
	 
	 public int getCash() {
		 return totalDeposits+fixedDepositAmount;
	 }
	 
}

class CurrentAccount extends Assignments2q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    
    public int getCash() {
		 return totalDeposits+creditLimit;
	 }
	 
}