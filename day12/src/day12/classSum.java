package day12;

class ex {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class classSum {
	public static void main(String[] args) {
		ex all = new ex();
		int sum = 0, sum4 = 0, cnt = 0, cnt2 = 0;
		for (int i = 0; i < all.arr.length; i++) {
			sum += all.arr[i];
			if (all.arr[i] % 4 == 0) {
				sum4 += all.arr[i];
				cnt++;
			}
			if (all.arr[i] % 2 == 0) {
				cnt2++;
			}
		}
		System.out.println("��ü ��: " + sum);
		System.out.println("4�� ��� ��: " + sum4);
		System.out.println("4�� ����� ����: " + cnt);
		System.out.println("¦���� ����: " + cnt2);
	}
}
