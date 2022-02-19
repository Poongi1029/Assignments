import java.util.Scanner;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
    	boolean valueFound=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==toCheckValue)
                valueFound=true;
        }
        return valueFound;
    }
}


public class q7 {

	public static void main(String[] args) {
		
		 int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	        int valueToCheck = 19;
        SearchArray searchArray = new SearchArray();

        if (searchArray.searchArray(arr, valueToCheck)) {
            System.out.println("element is present in array");
        } 
		else 
		{
            System.out.println("element is not present in array");
        }
        
	}

}