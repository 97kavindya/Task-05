package datafilehandling;

import java.io.*;



public class File02 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("data/The Return of Tarzan.txt"));

		System.out.println(r.lines().count());

		r.close();
	}

}
