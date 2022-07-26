package datafilehandling;

import java.io.*;



public class File01 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("data/The Return of Tarzan.txt"));

		r.lines().forEach(l -> System.out.println(l));

		r.close();
	}

}
