package day12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileload {
	public static void main(String[] args) {
		String fileName = "ex01.txt";
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		if (file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String data = br.readLine();
				System.out.println(data);
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
