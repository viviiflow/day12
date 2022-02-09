package day12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class reader {
	public static void main(String[] args) {
		File file = new File("0323.txt");
		if (file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);

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
