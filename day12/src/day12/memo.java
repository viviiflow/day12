package day12;

import java.io.FileWriter;
import java.io.IOException;

public class memo {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("0323.txt");
			fw.write("hi");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
