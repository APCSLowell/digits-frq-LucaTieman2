import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		digitList = new ArrayList<Integer>();
	    	if (num == 0) {
		   digitList.add(0);
		}
		int nNum = num;
		while (nNum > 0) {
		   digitList.add(0, nNum%10);
		   nNum = nNum/10;
		}
		
	}

	public boolean isStrictlyIncreasing()
	{ 
		for (int i = 0; i < digitList.size()-1; i++) {
		   if (digitList.get(i+1) <= digitList.get(i)) {
		   	return false;
		   }
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
