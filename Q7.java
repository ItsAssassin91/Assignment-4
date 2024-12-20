
public class Q7 {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,7,8,8};
		int sum = 0;
		
		for (int i = 0; i <= array.length - 1;i++) {
			sum += array[i];
		}
		System.out.println("The sum is: " + sum);
	}

}
