package javaFINISHED;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Deneme1 {
//	public static int sumOfNumber(int num) {
//	int sum = 0;
//	while(num!=0) {
//		int lastDigit = num%10;
//		sum = sum + lastDigit;
//		num = num/10;
//	}
//	return sum;
//}
//

	public static void main(String[] args) {

		int [] nums = new int [6];
		nums [0] = 44;
		nums [1] = 32;
		nums [2] = 100;
		nums [3] = 100;
		nums [4] = 7;
		nums [5] = 7;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
		set.add(nums[i]);
		}
		System.out.println(set);
	}
}
