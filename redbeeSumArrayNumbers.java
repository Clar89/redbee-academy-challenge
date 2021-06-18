 
public class redbeeSumArrayNumbers {
  

    public static void main( String [] args ) {

    	int [] arr = new int [4];

    	arr [0] = 1;
    	arr [1] = 2;
    	arr [2] = 3;
    	arr [3] = 4;

    	int sum = 0;
 

    	for (int i =0; i < 4; i++) {
            sum = sum + arr[i];
     
        }

        System.out.println(sum);

    }
}