import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num){
        int original = num;
        int arm =0;
        while(original!=0){
            int remainder = original%10;
            arm =arm+ (int)Math.pow(remainder,3); // adds the cube of remainder into arm
            original = original/10; // remove the last digit
        }

        if(num==arm)
            return true;
        else
            return false;
    }
}


public class q1 {

	public static void main(String[] args) {
		
		 	ArmstrongOrNot armstrongOrNot = new ArmstrongOrNot();
	        int num;
	        try (Scanner sc = new Scanner(System.in)) {
	        	num = sc.nextInt();
	        	}

	        if(armstrongOrNot.armstrongCheck(num)==true){
	            System.out.println(num + " is an armstrong number");
	        }
	        else
	        {
	            System.out.println(num + " is not an armstrong number");
	        }
	}

}
