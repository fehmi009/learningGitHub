package aslanherseyburadaPACKAGE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tue_ArrayLoop {

	public static int[] randomArray(int min, int max, int length) {  //Array return yapiyoruz !   -> int[]
		if(min>max) {
			int temp = min;
			min = max;
			max = temp;
		}
		Random random = new Random();
		int[]arr = new int [length];
		for (int i = 0; i <length; i++) {
			arr[i] = random.nextInt(max-min+1)+min;
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] farkliarr = randomArray(100, 90, 10);
		System.out.println(Arrays.toString(farkliarr));
	}
}
