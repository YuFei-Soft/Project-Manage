package mima;

import java.util.Arrays;
import java.util.Random;

public class RandomDemo2 {
	public static void main(String[] args) {

		int[] nums = new int[7];
		// ����7������
		Random rand = new Random();
		// ���������
		for (int i = 0; i < 7; i++) {
			int num = rand.nextInt(7) + 1;
			boolean flag = false;
			// �ж��Ƿ����ظ�
			for (int j = 0; j < 7; j++) {
				if (nums[j] == 0) {
					break;
				} else if (nums[j] == num) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				nums[i] = num;
			} else {
				i--;
			}
		}
		System.out.println(Arrays.toString(nums));

	}

}
