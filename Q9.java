
public class Q9 {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,7,8,9};
		int max = 0;
		
		for (int i = 0; i <= array.length - 1;i++) {
			if (array[i] > max) {
				max = array[i];
				
			}
		}
		System.out.println("The maximum value is: " + max);
	}

}
