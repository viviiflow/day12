package day12;

import java.io.FileWriter;
import java.io.IOException;

public class fileEx {
	public static void main(String[] args) {
		String fileName = "ex01.txt";
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("���� �����ϱ� ��������");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
