package day12;

import java.util.Scanner;

public class print {
	public static void main(String[] args) {
		String name = "";
		name += "100001/�̸���\n";
		name += "100002/�̿���\n";
		name += "100003/���缮\n";
		name += "100004/�ڸ��\n";
		name += "100005/�ֿ���\n";
		name += "100006/�ں���";

		String money = "";
		money += "100001/600\n";
		money += "100003/7000\n";
		money += "100001/100\n";
		money += "100002/400\n";
		money += "100001/600\n";
		money += "100004/900\n";
		money += "100001/130\n";
		money += "100003/200\n";
		money += "100002/700\n";
		money += "100002/900\n";
		money += "100004/800";

		String user = "";
		String[]arrN=name.split("\n");
		String[]arrM=money.split("\n");
		
		for(int i=0; i<arrM.length; i++) {
			for(int j=0; j<arrN.length; j++) {
				StringBuffer sb = new StringBuffer(arrM[i]);
				char n=arrN[j].charAt(5);
				char m=arrM[i].charAt(5);
				if(n==m) {
					String rs = arrN[j].substring(7,10);
					sb.insert(7,rs+"/");
					user +=sb+"\n";
				}
			}
		}
		System.out.println(user);
		
		
	}
}
