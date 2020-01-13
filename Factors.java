import java.util.Arrays;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(479001600 % 179424691);

		int[] myArry = new int[4];
		myArry[0] = 1;
		myArry[1] = 2;
		myArry[2] = 3;
		myArry[3] = 4;
		
		System.out.println(Arrays.toString(myArry));
		//option 1
		 int n = 420;
		 for(int i=2; i<=n; i++){
	        	if(n%i==0){
	        		System.out.println(i);
	        	}
		 }
		 
		 //option 2
	        for(int i=2; i<=n; i++){
	        		        	
	            while(n%i==0){
	                System.out.println(i + "| " + n);
	                System.out.println(" -----");
	                n = n/i;
	            }
	        }
		

	}

}
