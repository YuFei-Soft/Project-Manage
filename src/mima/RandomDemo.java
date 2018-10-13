package mima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 7; i++) {
			Random ran = new Random();
			int num = ran.nextInt(7) + 1;
			while (nums.contains(num))
				
			{
				num = ran.nextInt(7) + 1;
			}
			nums.add(num);
		}
		for (Integer i : nums) {
			System.out.println(i);
		}

	}

}
