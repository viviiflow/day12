package day12;

import java.util.Scanner;

public class printSum {
	public static void main(String[] args) {
		String data = "10001/��ö��/600\n";
		data += "10002/�̿���/800\n";
		data += "10001/��ö��/1400\n";
		data += "10003/���缮/780\n";
		data += "10002/�̿���/950\n";
		data += "10004/�ڸ��/330\n";
		data += "10001/��ö��/670\n";
		data += "10003/���缮/3300\n";
		data += "10002/�̿���/200\n";
		data += "10004/�ڸ��/6800\n";
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
		System.out.println("=====================");
		String[] token = data.split("\n");
		int total = token.length;
		System.out.println("total>>" + total);

		char[] x = { '1', '2', '3', '4' };
		for (int i = 0; i < 4; i++) {
			String[] user = token[i].split("/");
			int sum = 0;
			for (int j = 0; j < token.length; j++) {
				char u = x[i];
				char m = token[j].charAt(4);
				if (u == m) {
					String mo = token[j].substring(10, token[j].length());
					sum += Integer.parseInt(mo);
				}
			}
			System.out.println(user[0] + " " + user[1] + " " + sum);
		}
		System.out.println("=====================");
	}
}
