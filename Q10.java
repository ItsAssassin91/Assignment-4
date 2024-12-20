import java.util.Arrays;
public class Q10 {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9};
		int x = array.length;
		
		for (int i = 0; i < x / 2;i++) {
			int temp = array[i];
			array[i] = array[x - i - 1];
			array[x - i -1] = array[temp];
		}
		System.out.println(Arrays.toString(array));
		
		
	}

}
